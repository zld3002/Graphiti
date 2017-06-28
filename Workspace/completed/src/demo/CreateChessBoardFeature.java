package demo;

import org.eclipse.graphiti.examples.mm.chess.Board;
import org.eclipse.graphiti.examples.mm.chess.ChessFactory;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

public class CreateChessBoardFeature extends AbstractCreateFeature implements ICreateFeature {

	public CreateChessBoardFeature(IFeatureProvider fp) {
		super(fp, "Create Board", "Create a new chess board");
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public Object[] create(ICreateContext context) {
		Board board = ChessFactory.eINSTANCE.createBoard();
		context.getTargetContainer().eResource().getContents().add(board);

		addGraphicalRepresentation(context, board);
		return new Object[] { board };
	}
}
