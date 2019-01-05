import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonSubstringDPTest {

    LongestCommonSubstringDP longestCommonSubstringDP = new LongestCommonSubstringDP();

    @Test
    public void test_some_matchingStr() {

        int found = longestCommonSubstringDP.calculateSubstr("ABCDEF", "ADCDEX");
        Assert.assertEquals(3, found);
    }
}