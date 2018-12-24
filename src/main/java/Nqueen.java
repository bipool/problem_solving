import java.util.Arrays;

public class Nqueen {



    public boolean solve(int numberOfQueen){
        int[][] board = new int[numberOfQueen][numberOfQueen];
        if(solveUtil(board, 0)){
            for (int i = 0; i < numberOfQueen; i++) {
                System.out.println(Arrays.toString(board[i]));

            }
            System.out.println("Possible");
            return true;
        }

        System.out.println("impossible");
        return false;
    }


    public boolean solveUtil(int[][] board, int row) {
        if (row >= board.length) {
            return true;
        }


        for (int i = 0; i < board.length; i++) {
            if(isValid(board, row, i)) {

                board[row][i] = 1;

                if (solveUtil(board, row+1)) {
                    return true;
                }

                board[row][i] = 0;
            }
        }

        return false;
    }

    public boolean isValid(int[][] board, int x, int y) {

        for (int i = 0; i < x; i++) {
            if (board[i][y] == 1) { // check each column
                return false;
            }
        }

        if (!diagonalCheck(board, x, y))
            return false;

        return true;
    }

    public boolean diagonalCheck(int[][] board, int x, int y) {
        int row= x;
        int col = y ;

        while (row >= 0 && col >= 0) {
            if (board[row][col] == 1){
                return false;
            }

            row--;
            col--;
        }

        row = x ;
        col = y;
        while (row >= 0 && col < board.length) {
            if (board[row][col] == 1){
                return false;
            }

            row--;
            col++;
        }

        return true;
    }

}

