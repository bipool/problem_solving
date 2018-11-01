public class RotateLeftArray {



    private int[] reverseArray(int[] arr, int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return arr;
    }




    public int[] rotate(int[] arr, int numberOfRotation) {
        arr = reverseArray(arr, 0 , numberOfRotation-1);
        arr = reverseArray(arr, numberOfRotation, arr.length-1);
        arr = reverseArray(arr, 0, arr.length -1);
        return arr;
    }

}
