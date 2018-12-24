import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


class Node {

    int row;
    int col;
    int dist;

    Node(int row, int col, int dist) {
        this.col = col;
        this.row = row;
        this.dist = dist;
    }
}




public class ShortestDistanceLandmine {




    public int[][] calculate(char[][] maze) {


        int rows = maze.length ;
        int cols = maze[0].length;
        int res[][] = new int[rows][cols];

        Queue<Node> qNode = new LinkedList<Node>();

        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < cols ; j++) {
                res[i][j] = -1;
                if (maze[i][j] == 'M') {
                    res[i][j] = 0;
                    qNode.add(new Node(i, j, 0));
                }
            }
        }

        int[] tRows = {0,  0, -1, 1};
        int[] tCols = {-1, 1, 0, 0};

        while (!qNode.isEmpty()) {

            Node node = qNode.peek();
            qNode.poll();


            for (int i = 0; i < 4; i++) {

                int nextRow = node.row + tRows[i];
                int nextCol = node.col + tCols[i];

                if (inRange(nextRow, nextCol, res) && isSafe(nextRow, nextCol, res, maze)) {
                    res[nextRow][nextCol] = node.dist + 1;
                    qNode.add(new Node(nextRow, nextCol, node.dist + 1));
                }
            }

        }


        print(res);
        return res;
    }

    public boolean inRange(int row, int col, int[][] res) {
        return !(row < 0 || row > res.length -1 || col < 0 || col > res[0].length -1);

    }

    private boolean isSafe(int row, int col, int[][] res, char[][] maze) {
       return res[row][col] == -1 && maze[row][col] == 'O';
    }

    public void print(int[][] res) {

        for (int i = 0; i < res.length; i++) {
            System.out.println(Arrays.toString(res[i]));
        }
    }
}
