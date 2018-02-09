import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zulfiquer on 1/17/18.
 */
public class BinarySearchTest {

    BinarySearch binarySearch = new BinarySearch();

    @Test
    public void testSearch() {
        int[] arr = {1, 3, 5,  6, 12, 17, 23};
        boolean result = binarySearch.search(arr, 3);
        Assert.assertEquals(true, result);

        result = binarySearch.search(arr, 55);
        Assert.assertEquals(false, result);

    }

    @Test
    public void testSearchRecursive() {
        int[] arr = {1, 3, 5,  6, 12, 17, 23};
        boolean result = binarySearch.searchRecursive(arr, 3, 0, 6);
        Assert.assertEquals(true, result);

        result = binarySearch.searchRecursive(arr, 55, 0, 6);
        Assert.assertEquals(false, result);

    }
}