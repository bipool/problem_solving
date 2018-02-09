import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zulfiquer on 1/17/18.
 */
public class QuickSortTest {
    private QuickSort quickSort = new QuickSort();

    @Test
    public void sortData() throws Exception {
        int[] arr = {3, 5, 2, 8, 1, 4};
        arr = quickSort.sortData(arr);
        quickSort.print(arr);
    }

}