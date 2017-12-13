import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zulfiquer on 11/27/17.
 */
public class ReverseStringTest {

    private ReverseString reverseString = new ReverseString();


    @Test
    public void  test_hello() {
        String result = reverseString.reverse("Hello");
        Assert.assertEquals("olleH", result);
    }
}