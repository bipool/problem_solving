import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zulfiquer on 12/14/17.
 */
public class MaxTripletProductTest {

    private MaxTripletProduct tripletProduct = new MaxTripletProduct();

    @Test
    public void productWithNegativeNumbers_test() {
        int[] arr = {-10, -20, 5, 6, 1};
        int result = tripletProduct.product(arr);
        Assert.assertEquals(1200, result);
    }

    @Test
    public void productWithOneNegativeNumbers_test() {
        int[] arr = {-10, 20, 5, 6, 1};
        int result = tripletProduct.product(arr);
        Assert.assertEquals(600, result);
    }

    @Test
    public void productWithALLNegativeNumbers_test() {
        int[] arr = {-10, -20, -5, -6, -1};
        int result = tripletProduct.product(arr);
        Assert.assertEquals(-30, result);
    }

    @Test
    public void productWithALLPositiveNumbers_test() {
        int[] arr = {10, 20, 5, 6, 1};
        int result = tripletProduct.product(arr);
        Assert.assertEquals(1200, result);
    }

    @Test
    public void productWithZero_test() {
        int[] arr = {0, 0, 5, 6, 1};
        int result = tripletProduct.product(arr);
        Assert.assertEquals(30, result);
    }

    @Test
    public void productWithAllSame_test() {
        int[] arr = {1, 1, 1, 1, 1};
        int result = tripletProduct.product(arr);
        Assert.assertEquals(1, result);
    }

    @Test
    public void productWithAllSameAndThree_test() {
        int[] arr = { 1000, 1000, 1000};
        int result = tripletProduct.product(arr);
        Assert.assertEquals(1000000000, result);
    }

}