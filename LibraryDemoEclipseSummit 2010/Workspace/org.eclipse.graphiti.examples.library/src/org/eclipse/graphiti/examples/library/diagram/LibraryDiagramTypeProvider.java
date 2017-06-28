package org.eclipse.graphiti.examples.library.diagram;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;

/**
 * Defines the diagram type provider (in Eclipse more or less a sub type of the
 * Graphiti diagram editor) for the Library example diagram type.
 */
public class LibraryDiagramTypeProvider extends AbstractDiagramTypeProvider implements IDiagramTypeProvider {

	public LibraryDiagramTypeProvider() {
		super();

		// The diagram type provider needs to know its feature provider, so the
		// Graphiti framework can ask which operations are supported.
		setFeatureProvider(new LibraryFeatureProvider(this));
	}
}
