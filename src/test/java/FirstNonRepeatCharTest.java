import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zulfiquer on 9/23/17.
 */
public class FirstNonRepeatCharTest {

    private FirstNonRepeatChar firstNonRepeatChar = new FirstNonRepeatChar();


    @Test
    public void findFirstNonRepeatChar_empty_string() throws Exception {
        Character c = firstNonRepeatChar.findFirstNonRepeatChar("");
        Assert.assertNull(c);
    }

    @Test
    public void findFirstNonRepeatChar_find_first() throws Exception {
        Character c = firstNonRepeatChar.findFirstNonRepeatChar("ottaall");
        Assert.assertEquals('o', c.charValue());
    }

    @Test
    public void findFirstNonRepeatChar_find_last() throws Exception {
        Character c = firstNonRepeatChar.findFirstNonRepeatChar("ttaallo");
        Assert.assertEquals('o', c.charValue());
    }

    @Test
    public void findFirstNonRepeatChar_single_char() throws Exception {
        Character c = firstNonRepeatChar.findFirstNonRepeatChar("o");
        Assert.assertEquals('o', c.charValue());
    }

    @Test
    public void findFirstNonRepeatChar_find_none() throws Exception {
        Character c = firstNonRepeatChar.findFirstNonRepeatChar("ttaall");
        Assert.assertNull(c);
    }

    @Test
    public void findFirstNonRepeatChar_find() throws Exception {
        Character c = firstNonRepeatChar.findFirstNonRepeatChar("total");
        Assert.assertEquals('o', c.charValue());
    }

}