package algorithm;

/**
 * Created by zulfiquer on 10/15/17.
 */
public class Recursion {

    public static void main(String[] args) {
        System.out.println(displayNumber(6));
    }


    public static int displayNumber(int n) {
        if ( n == 0) {
            return 0;
        }

        if ( n == 1) {
            return 1;
        }



        return displayNumber(n - 1) + displayNumber(n -2);
        //System.out.println(n);
    }
}
