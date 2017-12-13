package algorithm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zulfiquer on 12/8/17.
 */
public class CoinChangeTest {

    private CoinChange coinChange = new CoinChange();

    @Test
    public void numberOfCoins_single() {
        int[] coins = {2};
        int result = coinChange.numberOfCoins(5, coins);
        Assert.assertEquals(-1, result);

    }

    @Test
    public void numberOfCoins_invalid() {
        int[] coins = {2};
        int result = coinChange.numberOfCoins(3, coins);
        Assert.assertEquals(-1, result);

    }


    @Test
    public void numberOfCoins_valid() {
        int[] coins = {7,2,3,6};
        int result = coinChange.numberOfCoins(13, coins);
        Assert.assertEquals(2, result);

    }

}