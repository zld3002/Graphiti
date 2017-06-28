Library Diagram Example as presented at EclipseSummit Europe in Ludwigsburg (November 2010)

This file contains both the designtime and the runtime workspace used for the demo. It will run
against Graphiti 0.7.x.

Follow these steps to get started with the example:
1) Import the 2 projects contained in the designtime workspace (folder 'Workspace'). The plugin
   org.eclipse.graphiti.examples.library.mm contains the used metamodel, the plugin project
   org.eclipse.graphiti.examples.library the graphical tool coding.
2) Start an Eclipse runtime (type 'Eclipse Application') containing the 2 plugins.
3) In the runtime import the project sample from the 'runtime-EclipseApplication' folder
4) Open the file sample/src/ClassicsLibrary.lib using the Ecore model editor (Open with). It contains 
   an example library definition
5) Open the file sample/src/diagrams/newDiagram.diagram using the Graphiti Diagram Editor (Open
   with).
6) Drag the file sample/src/ClassicsLibrary.lib from the Eclipse Project Explorer into the opened
   diagram editor. A shelf containing the books from the sample library will appear
7) Try to move around books.