import java.util.Arrays;

public class MinCoins {

    public int solve(int[] coins, int total) {
        int[][] table = new int[coins.length][total];
        Arrays.stream(table).forEach(t -> Arrays.fill(t, 9));

        for (int i = 0; i < coins.length; i++) {

            for (int j = coins[i]; j < total; j++) {
                if ( j == coins[i]) {
                    table[i][coins[i]-1] = 1;
                } else if (i != 0){
                    table[i][j] = table[i - 1][j];
                }


                if( (table[i][j-coins[i]] + 1) < table[i][j]){
                    table[i][j] = table[i][j-coins[i]] + 1;
                }

            }
        }

        printTable(table);

        return table[coins.length-1][total-1];
    }


    private void printTable(int[][] table) {

        for (int i = 0; i < table.length; i++) {
            System.out.println(Arrays.toString(table[i]));
        }
    }



}
