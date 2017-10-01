import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zulfiquer on 10/1/17.
 */
public class LargeNumberSummationTest {

    private LargeNumberSummation summation = new LargeNumberSummation();

    @Test
    public void sum_empty_numbers(){
        String result = summation.sum("", "");
        Assert.assertEquals("0", result);
    }


    @Test
    public void sum_equal_length(){
        String result = summation.sum("123", "123");
        Assert.assertEquals("246", result);
    }


    @Test
    public void sum_unequal_length(){
        String result = summation.sum("12345", "123");
        Assert.assertEquals("12468", result);
    }


    @Test
    public void sum_unequal_length_fist_str(){
        String result = summation.sum("123", "12345");
        Assert.assertEquals("12468", result);
    }

    @Test
    public void sum_carry_equal_length(){
        String result = summation.sum("559", "559");
        Assert.assertEquals("1118", result);
    }

    @Test
    public void sum_carry_unqqual_length(){
        String result = summation.sum("559", "59");
        Assert.assertEquals("618", result);
    }


    @Test
    public void sum_large(){
        String result = summation.sum("4096678", "90099890");
        Assert.assertEquals("94196568", result);
    }
}