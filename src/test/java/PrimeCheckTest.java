import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PrimeCheckTest {

    private PrimeCheck primeCheck = new PrimeCheck();

    @Test
    public void testPrimes() {
        int[] test = primeCheck.check(11);
        Arrays.stream(test).forEach(System.out::println);
    }

}