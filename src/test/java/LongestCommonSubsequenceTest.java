import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zulfiquer on 11/5/17.
 */
public class LongestCommonSubsequenceTest {

    private LongestCommonSubsequence subsequence = new LongestCommonSubsequence();

    @Test
    public void find_4length_test() {
        int length = subsequence.findLength("AGGTAB", "GXTXAYB");
        Assert.assertEquals(4, length);
        String sub = subsequence.findSequence("AGGTAB", "GXTXAYB");
        Assert.assertEquals("GTAB", sub);
    }

    @Test
    public void find_empty_test() {
        int length = subsequence.findLength("", "GXTXAYB");
        Assert.assertEquals(0, length);
    }

    @Test
    public void find_valid_test() {
        int length = subsequence.findLength("ABCDGH", "AEDFHR");
        Assert.assertEquals(3, length);
        String sub = subsequence.findSequence("AGGTAB", "GXTXAYB");
        Assert.assertEquals("ADH", sub);
    }

}