import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zulfiquer on 1/6/18.
 */
public class FibonacciTest {

    private Fibonacci fibonacci = new Fibonacci();

    @Test
    public void test_10(){
        int number = fibonacci.getFibonacci(10);
        Assert.assertEquals(34, number);
    }

}