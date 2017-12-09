package algorithm;

/**
 * Created by zulfiquer on 12/8/17.
 */
public class CoinChange {

    public int numberOfCoins(int total, int[] coins) {

        if ( total <= 0) {
            return 0;
        }

        if (coins.length == 0) {
            return  -1;
        }


        int[] value = new int[total+1];
        int[] coin = new int[total+1];
        for (int i = 0; i <= total ; i++) {
            value[i] = Integer.MAX_VALUE -1;
            coin[i] = -1;
        }

        value[0] = 0;
        for (int i = 0; i < coins.length; i++) {
            for (int j = 1; j <= total; j++) {
                if ((j >= coins[i])  && (value[j] > (1 + value[j - coins[i]]))) {
                    value[j] = 1 + value[j - coins[i]];
                    coin[j] = i;
                }
            }
        }

        if (value[total] >= Integer.MAX_VALUE -1) {
            return  -1;
        }

        displayCoins(coin, coins, total);
        return value[total];
    }

    private void displayCoins(int[] coin, int[] coins, int total) {
        while (total > 0) {
            System.out.println(coins[coin[total]]);
            total -= coins[coin[total]];
        }
    }
}
