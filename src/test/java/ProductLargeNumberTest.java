import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zulfiquer on 10/1/17.
 */
public class ProductLargeNumberTest {

    private ProductLargeNumber productLargeNumber = new ProductLargeNumber();

    @Test
    public void product_simple() {
        String result = productLargeNumber.product("12", "12");
        Assert.assertEquals("144", result);
    }
}