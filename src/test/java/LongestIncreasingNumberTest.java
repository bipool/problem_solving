import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zulfiquer on 11/3/17.
 */
public class LongestIncreasingNumberTest {

    private LongestIncreasingNumber number = new LongestIncreasingNumber();


    @Test
    public void validIncreasing_test() {
        int[] numbers = { 10, 22, 9, 33, 21, 50, 41, 60 };
        int length = number.find(numbers);
        Assert.assertEquals(5, length);
    }

    @Test
    public void validSameIncreasing_test() {
        int[] numbers = { 2,2 };
        int length = number.find(numbers);
        Assert.assertEquals(1, length);
    }

    @Test
    public void validAnother_test() {

        int[] numbers = { 10, 9, 2, 5, 3, 7, 101, 18 };
        int length = number.find(numbers);
        Assert.assertEquals(4, length);
    }
}