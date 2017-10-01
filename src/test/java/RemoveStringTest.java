import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zulfiquer on 9/25/17.
 */
public class RemoveStringTest {

    final RemoveString removeString = new RemoveString();

    @Test
    public void removeString_empty_match() {
        final String str = removeString.removeString("abcd", "");
        Assert.assertEquals("abcd", str);
    }

    @Test
    public void removeString_found() {
        final String str = removeString.removeString("I am a boy", "aeIou");
        Assert.assertEquals(" m  by", str);
    }


    @Test
    public void removeString_not_found() {
        final String str = removeString.removeString("I am a boy", "pqrs");
        Assert.assertEquals("I am a boy", str);
    }

    @Test
    public void removeString_found_first() {
        final String str = removeString.removeString("I am a boy", "I");
        Assert.assertEquals(" am a boy", str);
    }

    @Test
    public void removeString_found_last() {
        final String str = removeString.removeString("I am a boy", "y");
        Assert.assertEquals("I am a bo", str);
    }

}