/**
 * Created by zulfiquer on 1/17/18.
 */
public class QuickSort {
    public int[] sortData(int[] arr) {
       return  sort(arr, 0, arr.length-1);
    }



    public int[] sort(int[] arr, int start, int end) {
        if (start > end) {
            return arr;
        }

        int pivotIndex = partition(arr, start, end);
        sort(arr, start, pivotIndex-1);
        sort(arr, pivotIndex+1, end);

        return arr;
    }


    public int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start -1;

        for (int j = start; j < end; j++) {

            if (arr[j] < pivot) {
                i++;

                if(i!= j) {
                    swap(arr, i, j);
                }
            }
        }


        i++;
        swap(arr, end, i);
        return i;
    }


    public void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
