/**
 * Created by zulfiquer on 12/13/17.
 */
public class ProductExceptIndex {

    public int[] multiply(int[] arr) {

        int[]  arr1 = new int[arr.length];
        int[]  arr2 = new int[arr.length];
        int[]  result = new int[arr.length];

        arr1[0] = 1;
        arr2[arr.length-1] = 1;

        for (int i = 1; i < arr.length; i++) {
            arr1[i] = arr1[i-1] * arr[i-1];
        }



        for (int i = arr.length-2; i >= 0 ; i--) {
            arr2[i] = arr2[i+1] * arr[i+ 1];
        }


        for (int i = 0; i < arr.length; i++) {
            result[i] = arr1[i] * arr2[i];
        }

        return result;

    }

}
