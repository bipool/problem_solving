/**
 * Created by zulfiquer on 12/14/17.
 */
public class MaxTripletProduct {

    public int product(int[] arr) {

        int highest1 =  Integer.MIN_VALUE;
        int highest2 =  Integer.MIN_VALUE;
        int highest3 =  Integer.MIN_VALUE;
        int lowest1  =  Integer.MAX_VALUE;
        int lowest2  =  Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > highest1) {
                highest3 = highest2;
                highest2 = highest1;
                highest1 = arr[i];
            } else if (arr[i] > highest2 && arr[i] <= highest1) {
                highest3 = highest2;
                highest2 = arr[i];
            } else if (arr[i] > highest3 && arr[i] <= highest2) {
                highest3 = arr[i];
            }

            if (arr[i] < lowest1) {
                lowest2 = lowest1;
                lowest1 = arr[i];
            } else if (arr[i] <lowest2 && arr[i] >= lowest1) {
                lowest2 = arr[i];
            }
        }




        if (highest3 == Integer.MIN_VALUE) {
            highest3 = 1;
        }

        if (highest2 == Integer.MIN_VALUE) {
            highest2 = 1;
        }

        if (highest1 == Integer.MIN_VALUE) {
            highest1 = 1;
        }

        if (lowest1 == Integer.MAX_VALUE) {
            lowest1 = -1;
        }

        if (lowest2 == Integer.MAX_VALUE) {
            lowest2 = -1;
        }


        int prod1 = highest1 * highest2 * highest3;
        int prod2 = highest1 * lowest1 * lowest2;

        return  prod1 > prod2 ? prod1 : prod2;
    }
}
