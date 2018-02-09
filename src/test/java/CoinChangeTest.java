

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zulfiquer on 1/13/18.
 */
public class CoinChangeTest {

    private CoinChange coinChange = new CoinChange();

    @Test
    public void testNumberOfWays() {
        long[] coins = {1, 2, 3};
        long ways = coinChange.numberOfWays(coins, 5);
        Assert.assertEquals(5, ways);
    }


    @Test
    public void anotherTestNumberOfWays() {
        long[] coins = {3,4,6,7,9};
        long ways = coinChange.numberOfWays(coins, 15);
        Assert.assertEquals(7, ways);
    }
}