package org.eclipse.graphiti.examples.library.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.impl.DefaultMoveShapeFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;

public class MoveBookFeature extends DefaultMoveShapeFeature {

	public MoveBookFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canMoveShape(IMoveShapeContext context) {
		ContainerShape sourceContainer = context.getSourceContainer();
		ContainerShape targetContainer = context.getTargetContainer();

		// Allow moving if source and target containers are different, and the
		// target is a shelf section (not the diagram and no direct child of the
		// diagram)
		return sourceContainer != null && !sourceContainer.equals(targetContainer)
				&& !(targetContainer instanceof Diagram) && !(targetContainer.getContainer() instanceof Diagram);
	}

	@Override
	protected void postMoveShape(IMoveShapeContext context) {
		ContainerShape sectionContainerShape = context.getTargetContainer();
		
		// Calculate the index for the book in the new section 
		int column = sectionContainerShape.getChildren().size() - 1;
		
		// Find the graphics algorithm for the book
		GraphicsAlgorithm bookRectangle = context.getPictogramElement().getGraphicsAlgorithm();
		
		// Set the new location
		Graphiti.getGaService().setLocation(bookRectangle, column * 20, 5);
	}
}
