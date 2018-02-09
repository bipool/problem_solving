package algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zulfiquer on 1/14/18.
 */
public class GraphNode {
    private int value;
    private boolean visited = false;
    private List<Edge> edgeList = new ArrayList<Edge>();
    private List<GraphNode> neighbours = new ArrayList<GraphNode>();

    public GraphNode(int value) {
        this.value = value;
    }


    @Override
    public boolean equals(final Object obj) {
        GraphNode object = (GraphNode) obj;
        return object.getValue() == this.getValue();
    }

    public int getValue() {
        return value;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(final boolean visited) {
        this.visited = visited;
    }

    public void addEdge(final boolean isDirected, final GraphNode vertex1, final GraphNode vertex2, final int weight) {
        edgeList.add(new Edge(isDirected, vertex1, vertex2, weight));
    }

    public List<Edge> getEdgeList() {
        return  edgeList;
    }


    public void addNeighbour(GraphNode grapNode) {
        neighbours.add(grapNode);
    }

    public List<GraphNode> getNeighbours() {
        return neighbours;
    }

}
