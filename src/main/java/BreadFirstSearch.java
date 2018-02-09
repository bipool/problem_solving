import algorithm.Graph;
import algorithm.GraphNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by zulfiquer on 1/14/18.
 */
public class BreadFirstSearch {

    public static void search(Graph graph, int start) {

        LinkedList<GraphNode> nodes = new LinkedList<GraphNode>();
        nodes.add(graph.getGraphNodeById(start));

        while (!nodes.isEmpty()) {
            GraphNode node = nodes.poll();
            System.out.println(node.getValue());
            node.setVisited(true);
            List<GraphNode> neighbours = node.getNeighbours();
            for (GraphNode neighbour : neighbours) {
                //System.out.println("Neighbour :: " + neighbour.getValue() + " visited :: " + neighbour.isVisited());
                if(!neighbour.isVisited() && !nodes.contains(neighbour)) {
                    //System.out.println("added");
                    nodes.add(neighbour);
                }
            }

        }
    }


    public static void dfs(Graph graph, int start) {
        LinkedList<GraphNode> nodes = new LinkedList<GraphNode>();
        nodes.add(graph.getGraphNodeById(start));

        while (!nodes.isEmpty()) {

            GraphNode node = nodes.removeLast();
            System.out.println(node.getValue());
            node.setVisited(true);
            List<GraphNode> neighbours = node.getNeighbours();
            for (GraphNode neighbour : neighbours) {
                System.out.println("Neighbour :: " + neighbour.getValue() + " visited :: " + neighbour.isVisited());
                if(!neighbour.isVisited() && !nodes.contains(neighbour)) {
                    nodes.add(neighbour);
                }
            }
        }
    }



    public static void dfsRecursive(GraphNode node) {

        node.setVisited(true);
        System.out.println(node.getValue());

        List<GraphNode> neighbours = node.getNeighbours();
        for (GraphNode neighbour : neighbours) {
            //System.out.println("Neighbour :: " + neighbour.getValue() + " visited :: " + neighbour.isVisited());
            if(!neighbour.isVisited() ){
                dfsRecursive(neighbour);
            }
        }

    }

    public static void main(String args[]) {
        Graph graph = new Graph(5,  false);
        graph.addEdge(0, 2);
        graph.addEdge(0, 1);
        graph.addEdge(2, 4);
        //graph.addEdge(4, 3);
        //graph.addEdge(2, 4);
        graph.addEdge(1, 3);

        //graph.print();
       // search(graph, 0);

        System.out.println("----------------");
        //dfs(graph, 0);
        dfsRecursive(graph.getGraphNodeById(0));
    }
}
