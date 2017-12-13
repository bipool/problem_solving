/**
 * Created by zulfiquer on 12/12/17.
 */
public class FindIsland {

    public int numberOfIsland(char[][] graph) {

        int count = 0;

        if ( graph.length == 0 || graph[0].length == 0) {
            return 0;
        }

        int rows = graph.length;
        int cols = graph[0].length;

        boolean[][] visited = new boolean[graph.length][graph[0].length];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if(visited[i][j] == false && graph[i][j] == '1') {
                    count++;
                    checkAroundDFS(graph, visited, i, j);
                }

            }
        }

        return count;

    }




    private void checkAroundDFS(char[][] graph, boolean[][] visited, int i, int j) {

        if ( i < 0 || i == graph.length || j < 0 || j == graph[i].length) {
            return;
        }

        visited[i][j] = true;


        if (graph[i][j] == '0') {
            return;
        }
        graph[i][j] = '0';
/*
        checkAroundDFS(graph, visited, i, j+1);
        checkAroundDFS(graph, visited, i+1, j);
        checkAroundDFS(graph, visited, i+1, j+1);
        checkAroundDFS(graph, visited, i-1, j+1);
*/


        checkAroundDFS(graph, visited, i, j+1);
        checkAroundDFS(graph, visited, i, j-1);
        checkAroundDFS(graph, visited, i+1, j);
        checkAroundDFS(graph, visited, i-1, j);

    }

}
