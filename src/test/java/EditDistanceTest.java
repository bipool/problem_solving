import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zulfiquer on 11/5/17.
 */
public class EditDistanceTest {

    private EditDistance editDistance = new EditDistance();

    @Test
    public void find_valid_test() {
        int operations = editDistance.findNumberOfOperation("sunday", "saturday");
        Assert.assertEquals(3, operations);
    }

    @Test
    public void find_valid2_test() {
        int operations = editDistance.findNumberOfOperation("abc", "efg");
        Assert.assertEquals(3, operations);
    }

    @Test
    public void find_empty_test() {
        int operations = editDistance.findNumberOfOperation("", "saturday");
        Assert.assertEquals(8, operations);
    }
}