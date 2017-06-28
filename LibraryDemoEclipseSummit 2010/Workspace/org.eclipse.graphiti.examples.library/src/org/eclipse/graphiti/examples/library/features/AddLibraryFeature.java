package org.eclipse.graphiti.examples.library.features;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.examples.library.Book;
import org.eclipse.graphiti.examples.library.Library;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.features.context.impl.AreaContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeService;
import org.eclipse.graphiti.util.ColorConstant;

public class AddLibraryFeature extends AbstractAddFeature {

	private static final int SHELF_SECTION_COUNT = 3;
	
	public AddLibraryFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canAdd(IAddContext context) {
		// This feature supports to add a library object directly into the diagram
		if (context.getNewObject() instanceof Library && context.getTargetContainer() instanceof Diagram) {
			return true;
		}
		return false;
	}

	@Override
	public PictogramElement add(IAddContext context) {
		// Get information from context
		Library library = (Library) context.getNewObject();
		Diagram diagram = (Diagram) context.getTargetContainer();

		// Get Graphiti services for easier access
		IPeService peService = Graphiti.getPeService();
		IGaService gaService = Graphiti.getGaService();

		// Create a book shelf
		ContainerShape shelfContainerShape = peService.createContainerShape(diagram, true);
		Rectangle shelfRectangle = gaService.createRectangle(shelfContainerShape);
		gaService.setLocationAndSize(shelfRectangle, context.getX(), context.getY(), 300, 360);
		shelfRectangle.setBackground(manageColor(ColorConstant.VC_DARK_BROWN));
		link(shelfContainerShape, library);

		// Add the library name on top
		Shape libraryNameShape = peService.createShape(shelfContainerShape, false);
		Text libraryNameText = gaService.createText(libraryNameShape);
		gaService.setLocationAndSize(libraryNameText, 10, 10, 280, 20);
		libraryNameText.setForeground(manageColor(ColorConstant.WHITE));
		gaService.createFont(libraryNameText, "Arial", 16);
		libraryNameText.setValue(library.getName());
		
		// Add 3 sections to the shelf
		ContainerShape[] sectionContainerShapes = new ContainerShape[SHELF_SECTION_COUNT];
		for (int row = 0; row < SHELF_SECTION_COUNT; row++) {
			sectionContainerShapes[row] = peService.createContainerShape(shelfContainerShape, true);
			Rectangle rowRectangle = gaService.createRectangle(sectionContainerShapes[row]);
			gaService.setLocationAndSize(rowRectangle, 10, 30 + row * 110, 280, 100);
			rowRectangle.setBackground(manageColor(ColorConstant.DARK_GRAY));
		}

		// Add the books to the shelf sections (fill shelf sections evenly from left to right)
		EList<Book> books = library.getBooks();
		int bookNumber = 0;
		for (Iterator<Book> iterator = books.iterator(); iterator.hasNext();) {
			Book book = iterator.next();
			
			// Create an add context that describes where to add the book in the shelf (which section)
			AddContext addBookContext = new AddContext(new AreaContext(), book);
			addBookContext.setTargetContainer(sectionContainerShapes[bookNumber%SHELF_SECTION_COUNT]);
			
			// Trigger the Graphiti framework to find a feature that is capable of adding a book
			addGraphicalRepresentation(addBookContext, book);

			bookNumber++;
		}

		// Return the root pictogram element
		return shelfContainerShape;
	}
}
