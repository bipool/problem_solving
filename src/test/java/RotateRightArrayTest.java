import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RotateRightArrayTest {

    RotateRightArray rotateRightArray = new RotateRightArray();

    private void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    @Test
    public void testEvenArray() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        arr = rotateRightArray.rotate(arr, 3);
        int[] exp = {4, 5, 6, 1, 2, 3};
        Assert.assertArrayEquals(exp, arr);
    }

    @Test
    public void testOddArray() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        arr = rotateRightArray.rotate(arr, 3);
        int[] exp = {5, 6, 7, 1, 2, 3, 4};
        Assert.assertArrayEquals(exp, arr);
    }



}