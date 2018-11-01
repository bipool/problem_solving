public class MaxSumSubarray {
    public int calculate(int[] data) {
        int sum = 0;

        if ( data.length <= 0) {
            return sum;
        }

        if (data.length == 1) {
            return data[0];
        }

        sum = data[0];
        int maxSoFar = data[0];
        for (int i = 1; i < data.length; i++) {

            sum = sum + data[i];
            if ( sum > maxSoFar) {
                maxSoFar = sum;
            }

            if ( sum < 0) {
                sum = 0;
            }
        }

        return maxSoFar;
    }
}
