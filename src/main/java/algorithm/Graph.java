package algorithm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by zulfiquer on 1/14/18.
 */





public class Graph {

    private int numberOfVertex = 0;
    private GraphNode[] nodes;
    private boolean isDirected;

    private LinkedList<Integer>[] adjacentMatrix;

    public Graph(int numberOfVertex, boolean isDirected) {
        this.isDirected = isDirected;
        this.numberOfVertex = numberOfVertex;
        this.nodes = new GraphNode[numberOfVertex];

        adjacentMatrix = new LinkedList[numberOfVertex];
        for (int i = 0; i < numberOfVertex; i++) {
            adjacentMatrix[i] = new LinkedList<Integer>();
            this.nodes[i] = new GraphNode(i);
        }

    }

    public void addEdge(int source, int destination) {
        this.adjacentMatrix[source].addFirst(destination);
        this.adjacentMatrix[destination].addFirst(source);

        nodes[source].addNeighbour(nodes[destination]);
        nodes[source].addEdge(isDirected, nodes[source], nodes[destination], 0);
        if(!isDirected) {
            nodes[destination].addNeighbour(nodes[source]);
            nodes[destination].addEdge(isDirected, nodes[destination], nodes[source], 0);
        }

    }

    public GraphNode getGraphNodeById(int i) {
        return nodes[i];
    }

    public void print() {
        int i = 0;
        for (LinkedList<Integer> adjacent : adjacentMatrix) {
            System.out.println("-----------" + i++ + "----------------");
            Iterator iterator = adjacent.iterator();
            while (iterator.hasNext()) {
                Integer value = (Integer) iterator.next();
                System.out.println(value);
            }
        }
    }


}
