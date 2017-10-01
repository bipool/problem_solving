import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zulfiquer on 9/23/17.
 */
public class CheckDuplicateNumberContainsTest {
    private CheckDuplicateNumberContains duplicateNumberContains = new CheckDuplicateNumberContains();

    @Test
    public void duplicateNumberContains_empty() {
        boolean result = duplicateNumberContains.checkDuplicate(new int[0]);
        Assert.assertFalse(result);
    }

    @Test
    public void duplicateNumberContains_found_first() {
        boolean result = duplicateNumberContains.checkDuplicate(new int[] {2, 2, 3, 3, 1});
        Assert.assertTrue(result);
    }

    @Test
    public void duplicateNumberContains_found_last() {
        boolean result = duplicateNumberContains.checkDuplicate(new int[] {1, 4, 2, 3, 3});
        Assert.assertTrue(result);
    }

    @Test
    public void duplicateNumberContains_found() {
        boolean result = duplicateNumberContains.checkDuplicate(new int[] {2, 5, 1,  1, 3});
        Assert.assertTrue(result);
    }


    @Test
    public void duplicateNumberContains_not_found() {
        boolean result = duplicateNumberContains.checkDuplicate(new int[] {2, 5, 7, 3, 9, 1});
        Assert.assertFalse(result);
    }
}