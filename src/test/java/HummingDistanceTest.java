import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zulfiquer on 9/24/17.
 */
public class HummingDistanceTest {

    private HummingDistance distance = new HummingDistance();

    @Test
    public void hammingDistance_same_number() {
        int result = distance.hammingDistance(4, 4);
        Assert.assertEquals(0, result);
    }

    @Test
    public void hammingDistance_diff() {
        int result = distance.hammingDistance(1, 4);
        Assert.assertEquals(2, result);
    }

}