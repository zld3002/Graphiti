package demo;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;

public class ChessDiagramTypeProvider extends AbstractDiagramTypeProvider {

	public ChessDiagramTypeProvider() {
		super();
		setFeatureProvider(new ChessFeatureProvider(this));
	}
}
