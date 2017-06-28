package org.eclipse.graphiti.examples.library.diagram;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.examples.library.Book;
import org.eclipse.graphiti.examples.library.Library;
import org.eclipse.graphiti.examples.library.features.AddBookFeature;
import org.eclipse.graphiti.examples.library.features.AddLibraryFeature;
import org.eclipse.graphiti.examples.library.features.MoveBookFeature;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IMoveShapeFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;

/**
 * Is used by the Graphiti framework to find out which operations are supported
 * by this editor in the current situation.
 */
public class LibraryFeatureProvider extends DefaultFeatureProvider {

	public LibraryFeatureProvider(IDiagramTypeProvider dtp) {
		super(dtp);
	}

	/**
	 * Called in case an existing object is added to a diagram. Needs to return
	 * the feature that can handle adding such an object.
	 */
	@Override
	public IAddFeature getAddFeature(IAddContext context) {

		// Drag&drop of file from project explorer
		if (context.getNewObject() instanceof IFile) {
			// In the demo a file object is passed to the diagram (from the
			// project explorer). This file needs to be an EMF resource and must
			// contain a library object as its first root object. This library
			// object is retrieved and set as the new object to be added in the context.
			context = adaptAddLibraryContext(context);
		}

		// Adding a library
		if (context.getNewObject() instanceof Library) {
			return new AddLibraryFeature(this);
		}

		// Adding a book (called from within the add feature for libraries)
		if (context.getNewObject() instanceof Book) {
			return new AddBookFeature(this);
		}

		return super.getAddFeature(context);
	}

	/**
	 * Called in case an existing object on the diagram is moved. Needs to
	 * return a feature that can handle the move operation or <code>null</code>
	 * to prevent the operation.
	 */
	@Override
	public IMoveShapeFeature getMoveShapeFeature(IMoveShapeContext context) {
		// Retrieve the domain object for the moved pictogram element
		Object businessObject = getBusinessObjectForPictogramElement(context
				.getShape());

		// In our example shapes that are not connected to any domain object
		// shall not be movable (e.g. the sections of the shelf)
		if (businessObject == null) {
			return null;
		}

		// Moving a book
		if (businessObject instanceof Book) {
			return new MoveBookFeature(this);
		}

		// All other cases
		return super.getMoveShapeFeature(context);
	}

	
	
	/*
	 * Private helper method
	 */

	private IAddContext adaptAddLibraryContext(IAddContext context) {
		Object newObject = context.getNewObject();
		if (newObject instanceof IFile) {
			IFile file = (IFile) newObject;
			if ("lib".equals(file.getFileExtension())) {
				ContainerShape targetContainer = context.getTargetContainer();
				if (targetContainer instanceof Diagram) {
					Diagram diagram = (Diagram) targetContainer;
					ResourceSet resourceSet = diagram.eResource()
							.getResourceSet();
					TransactionalEditingDomain editingDomain = TransactionUtil
							.getEditingDomain(resourceSet);
					if (editingDomain == null) {
						editingDomain = TransactionalEditingDomain.Factory.INSTANCE
								.createEditingDomain(resourceSet);
					}
					@SuppressWarnings("restriction")
					URI uri = org.eclipse.graphiti.ui.internal.services.GraphitiUiInternal
							.getEmfService().getFileURI(file, resourceSet);
					Resource resource = resourceSet.getResource(uri, true);
					if (resource != null) {
						Library library = (Library) resource.getContents().get(
								0);
						if (library != null) {
							AddContext addContext = (AddContext) context;
							addContext.setNewObject(library);
							return addContext;
						}
					}

				}
			}
		}
		return context;
	}
}
