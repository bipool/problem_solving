/**
 * Created by zulfiquer on 1/13/18.
 */
public class CoinChange {


    public long numberOfWays(long[] coins, int total) {

        long[][] dp = new long[coins.length + 1][total+1];

        for (int i = 0; i <= coins.length; i++) {
            dp[i][0] = 1;
        }


        for (int i = 1; i <= coins.length; i++) {
            for (int j = 1; j <= total; j++) {
                if ( coins[i - 1] > j) {
                    dp[i][j] = dp[i-1][j];
                } else {
                    dp[i][j] = dp[i-1][j] + dp[i][j - (int)coins[i-1]];
                }
            }
        }

        return dp[coins.length][total];
    }
}
