import javax.swing.*;
import java.awt.*;
import java.util.*;
public class GraphComponent extends JComponent {
  private final int PANE_SIDE_LENGTH = 600;// to be changed if necessary
  private final int BOUNDARY_START = 50; // This denotes the leftmost or topmost pixel of the boundary within which we want the graph to appear
  private final int BOUNDARY_END = 450;// This denotes the rightmost or downmost pixel of the boundary within which we want the graph to appear
  private Graph graph;
  private Color color;
  private final int DIAMETER = 16;
  public GraphComponent (Graph graph) {
    this.graph = graph;
  }
  public void paintComponent (Graphics g) {
    Graphics2D g2 = (Graphics2D) g;
    RenderingHints rh = new RenderingHints(
             RenderingHints.KEY_ANTIALIASING,
             RenderingHints.VALUE_ANTIALIAS_ON);
    g2.setRenderingHints(rh);

    // Draw the edges
    HashMap<Integer, Vertex> vertices = graph.getVertices();
    ArrayList<Edge> edges = graph.getEdges();
    for (int i=0; i<edges.size(); i++) {
      Vertex startVertex = edges.get(i).getStartVertex();
      Vertex endVertex = edges.get(i).getEndVertex();
      g2.setColor(Color.BLACK);
      g2.drawLine(startVertex.getMidX(), startVertex.getMidY(),
                endVertex.getMidX(), endVertex.getMidY());
    }

    // Draw the vertices
    for (int i=1; i<=vertices.size(); i++) {
      Vertex vertex = vertices.get(i);
      g2.setColor(vertices.get(i).getColor());
      g2.fillOval(vertices.get(i).getLeftX(),
                vertices.get(i).getTopY(),
                DIAMETER, DIAMETER
                );
    }

    // Display node numbers - we can turn this off if necessary or make it optional to user
    for (int i=1; i<=vertices.size(); i++) {
      g2.setColor(Color.BLACK);
      g2.drawString(" " +vertices.get(i).getVertexNumber(),
                vertices.get(i).getLeftX(),
                (vertices.get(i).getTopY())-5);
    }
  }
  
}
