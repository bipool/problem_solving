public class RotateRightArray {

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
        int len = arr.length -1;
        arr = reverseArray(arr, 0 , len - numberOfRotation);
        arr = reverseArray(arr, (len - numberOfRotation) + 1, len);
        return reverseArray(arr, 0, len);
    }
}
