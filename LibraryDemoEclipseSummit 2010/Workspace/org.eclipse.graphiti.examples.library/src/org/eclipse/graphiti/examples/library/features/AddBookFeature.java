package org.eclipse.graphiti.examples.library.features;

import java.util.Random;

import org.eclipse.graphiti.examples.library.Book;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;

public class AddBookFeature extends AbstractAddFeature {

	private static final IColorConstant[] COLORS = new IColorConstant[] { ColorConstant.YELLOW, ColorConstant.RED, ColorConstant.GREEN,
			ColorConstant.ORANGE };

	private static Random RANDOM = new Random();

	public AddBookFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canAdd(IAddContext context) {
		// Feature supports to add a book object into a section of the library
		if (context.getNewObject() instanceof Book && context.getTargetContainer() instanceof ContainerShape) {
			return true;
		}
		return false;
	}

	@Override
	public PictogramElement add(IAddContext context) {
		// Get information from context
		Book book = (Book) context.getNewObject();
		ContainerShape sectionContainerShape = (ContainerShape) context.getTargetContainer();

		// Get Graphiti services for easier access
		IPeService peService = Graphiti.getPeService();
		IGaService gaService = Graphiti.getGaService();

		// Calculate the location of the book in the shelf (use next free contiguous slot)
		int column = sectionContainerShape.getChildren().size();
		
		// Add the book to the shelf section (displayed as randomly colored rectangle)
		Shape bookShape = peService.createShape(sectionContainerShape, true);
		Rectangle bookRectangle = gaService.createRectangle(bookShape);
		gaService.setLocationAndSize(bookRectangle, column * 20, 5, 20, 95);
		bookRectangle.setBackground(manageColor(COLORS[RANDOM.nextInt(COLORS.length)]));
		link(bookShape, book);

		// And show the title of the book
		Text bookTitleText = gaService.createText(bookRectangle);
		bookRectangle.getGraphicsAlgorithmChildren().add(bookTitleText);
		gaService.setLocationAndSize(bookTitleText, 0, -2, 20, 95);
		bookTitleText.setForeground(manageColor(ColorConstant.BLACK));
		bookTitleText.setAngle(270);
		bookTitleText.setValue(book.getName());

		return bookShape;
	}
}
