import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zulfiquer on 10/8/17.
 */
public class BinaryNumberAlternateBitsTest {

    private BinaryNumberAlternateBits alternateBits = new BinaryNumberAlternateBits();

    @Test
    public void checkAlternate_empty() {
        boolean result = alternateBits.hasAlternatingBits(0);
        Assert.assertEquals(true, result);
    }

    @Test
    public void checkAlternate_valid() {
        boolean result = alternateBits.hasAlternatingBits(5);
        Assert.assertEquals(true, result);
    }

    @Test
    public void checkAlternate_valid_2() {
        boolean result = alternateBits.hasAlternatingBits(10);
        Assert.assertEquals(true, result);
    }

    @Test
    public void checkAlternate_invalid() {
        boolean result = alternateBits.hasAlternatingBits(7);
        Assert.assertEquals(false, result);
    }

    @Test
    public void checkAlternate_invalid_2() {
        boolean result = alternateBits.hasAlternatingBits(11);
        Assert.assertEquals(false, result);
    }
}