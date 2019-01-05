import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinCoinsTest {
    private MinCoins minCoins = new MinCoins();

    @Test
    public void testMinCoins() {
        int[] arr = {9, 7, 4, 1};
        int found = minCoins.solve(arr, 11);
        Assert.assertEquals(2, found);
    }

}