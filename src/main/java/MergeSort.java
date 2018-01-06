/**
 * Created by zulfiquer on 1/4/18.
 */
public class MergeSort {

     void merge(int[] arr, int start, int middle, int end) {

        int size1 = middle - start + 1;
        int size2 = end - middle;

        int[] copyLeft = new int[size1];
        int[] copyRight = new int[size2];

        for (int i = 0; i < size1; i++) {
            copyLeft[i] = arr[start + i];
        }

        for (int i = 0; i < size2; i++) {
            copyRight[i] = arr[middle+1 + i];
        }



        int i = 0, j = 0, k = start;


        while (i < size1 && j < size2) {

            if ( copyLeft[i] <= copyRight[j]) {
                arr[k] = copyLeft[i];
                i++;
            } else {
                arr[k] = copyRight[j];
                j++;
            }

            k++;
        }




        while (i < size1) {
            arr[k] = copyLeft[i];
            k++;
            i++;
        }


        while (j < size2) {
            arr[k] = copyRight[j];
            k++;
            j++;
        }

      //  printArr(arr);

    }


    public int[] sort(int[] arr, int start, int end) {

        if (start >= end ) {
            return arr;
        }


        int middle = (end + start) / 2;


        sort(arr, start, middle);
        sort(arr, middle + 1, end);

        merge(arr, start, middle, end);
        return arr;
    }


    void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("---");
    }
}
