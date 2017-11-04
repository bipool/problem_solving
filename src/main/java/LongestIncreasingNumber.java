/**
 * Created by zulfiquer on 11/3/17.
 */
public class LongestIncreasingNumber {

    public int find(int[] arr) {
        int length = arr.length;
        if (length <= 1) {
            return length;
        }

        int maxLength = 0;
        int[] lis = new int[length];
        for (int i =0; i < length; i++) {
            lis[i] = 1;
        }


       for (int i = 1; i < length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && lis[i] <= lis[j]) {
                    lis[i] = lis[j] + 1;

                    if (lis[i] > maxLength) {
                        maxLength = lis[i];
                    }
                }
            }
        }

        return  maxLength;
    }
}
