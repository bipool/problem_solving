package algorithm;

/**
 * Created by zulfiquer on 1/14/18.
 */
public class Edge {

    private boolean isDirected = false;
    private GraphNode vertex1;
    private GraphNode vertex2;
    private int weight;

    public Edge(final boolean isDirected, final GraphNode vertex1, final GraphNode vertex2, final int weight) {
        this.isDirected = isDirected;
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.weight = weight;
    }

    public boolean isDirected() {
        return isDirected;
    }

    public void setDirected(final boolean directed) {
        isDirected = directed;
    }

    public GraphNode getVertex1() {
        return vertex1;
    }

    public void setVertex1(final GraphNode vertex1) {
        this.vertex1 = vertex1;
    }

    public GraphNode getVertex2() {
        return vertex2;
    }

    public void setVertex2(final GraphNode vertex2) {
        this.vertex2 = vertex2;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(final int weight) {
        this.weight = weight;
    }
}
