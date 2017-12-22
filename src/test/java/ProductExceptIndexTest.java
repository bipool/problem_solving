import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zulfiquer on 12/13/17.
 */
public class ProductExceptIndexTest {

    private ProductExceptIndex productExceptIndex = new ProductExceptIndex();

    @Test
    public void valid_test() {
        int[] arr = {1, 3, 4, 5};
        int[] result = productExceptIndex.multiply(arr);
        int[] expected = {60, 20, 15, 12};

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        //Assert.assertEquals(expected, result);
    }

}