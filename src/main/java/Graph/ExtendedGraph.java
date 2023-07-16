package Graph;

import java.util.ArrayList;
import java.util.List;

public class ExtendedGraph extends AbstractGraph {
    public ExtendedGraph(List vertices, List edges) {
        super(vertices, edges);
    };

    /**
     * Return list of edges around vertex
     * 
     * @param v the vertex to get edges from
     */
    // ** TO DO **
    public List<Edge> incidentEdges(Vertex v) {
        // Returns the edges around vertex v
        List<Edge> result = new ArrayList<>();
        for (Edge edge : edges) {
            if (edge.vertex1.getLabel().equals(v.getLabel())) {
                result.add(edge);
            }
        }
        return result;
    }

}