/**
 * Created by zulfiquer on 1/17/18.
 */
public class BinarySearch {

    public boolean search(int[] arr, int search) {

        int low = 0;
        int high = arr.length -1;


        while (low < high) {
            int mid = (low + high) / 2;

            if (arr[mid] == search) {
                return  true;
            }


            if(arr[mid] < search) {
                low = mid + 1;
            } else {
                high = mid -1;
            }

        }

        return false;
    }



    public boolean searchRecursive(int[] arr, int search, int start, int end) {
        if ( start > end) {
            return false;
        }

        int mid = (start + end) / 2;

        if ( arr[mid] == search) {
            return true;
        }

        if ( arr[mid] < search) {
           return searchRecursive(arr, search, mid + 1, end);
        } else {
            return searchRecursive(arr, search, start, mid -1);
        }


    }
}
