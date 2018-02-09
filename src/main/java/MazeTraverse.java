/**
 * Created by zulfiquer on 2/1/18.
 */
public class MazeTraverse {

    public void  traverse(int[][] maze){

        int[][] visited = new int[maze.length][maze[0].length];
        traverseUtil(maze, visited, 0, 0);
    }

    private void traverseUtil(int[][] maze, int[][] visited, int row, int col) {


        if (row < 0 || col <0 || row >= maze.length || col >= maze[0].length) {
            return;
        }


        if (visited[row][col] == 1) {
            return;
        }

        System.out.println(maze[row][col]);
        visited[row][col] = 1;

        traverseUtil(maze, visited, row+1, col);
        traverseUtil(maze, visited, row, col+1);
        traverseUtil(maze, visited, row-1, col);
        traverseUtil(maze, visited, row, col-1);
    }
}
