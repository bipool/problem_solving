import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zulfiquer on 11/12/17.
 */
public class ReverseVowelTest {

    private ReverseVowel reverseVowel = new ReverseVowel();

    @Test
    public void valid_leetcode() {
        String actual = reverseVowel.generate("leetcode");
        Assert.assertEquals("leotcede", actual);
    }

    @Test
    public void valid_test() {
        String actual = reverseVowel.generate("leet");
        Assert.assertEquals("leet", actual);
    }

    @Test
    public void empty_test() {
        String actual = reverseVowel.generate("");
        Assert.assertEquals("", actual);
    }

    @Test
    public void single_test() {
        String actual = reverseVowel.generate("e");
        Assert.assertEquals("e", actual);
    }


    @Test
    public void single_middle_test() {
        String actual = reverseVowel.generate("let");
        Assert.assertEquals("let", actual);
    }

    @Test
    public void odd_vowel_test() {
        String actual = reverseVowel.generate("bipool");
        Assert.assertEquals("bopoil", actual);
    }
}