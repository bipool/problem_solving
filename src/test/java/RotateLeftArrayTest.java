import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RotateLeftArrayTest {

    private RotateLeftArray rotateLeftArray = new RotateLeftArray();


    private void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    @Test
    public void testEvenArray() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        arr = rotateLeftArray.rotate(arr, 3);
        int[] exp = {4, 5, 6, 1, 2, 3};
        Assert.assertArrayEquals(exp, arr);
    }

    @Test
    public void testOddArray() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        arr = rotateLeftArray.rotate(arr, 3);
        int[] exp = {4, 5, 6, 7, 1, 2, 3};
        Assert.assertArrayEquals(exp, arr);
    }





}