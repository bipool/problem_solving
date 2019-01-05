import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSumSubarrayTest {
    private MaxSumSubarray maxSumSubarray = new MaxSumSubarray();

    @Test
    public void testMaxSubArrayCalculate() {
        int[] data = {2, 1, -2, 3, 4, -2, -1};
        int result = maxSumSubarray.calculate(data);
        Assert.assertEquals(8, result);
    }


}