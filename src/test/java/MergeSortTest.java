import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zulfiquer on 1/4/18.
 */
public class MergeSortTest {

    private MergeSort mergeSort = new MergeSort();

    @Test
    public void sort_test() {
        int[] arr = {3, 2, 5, 7, 9};
        arr = mergeSort.sort(arr, 0, arr.length-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}