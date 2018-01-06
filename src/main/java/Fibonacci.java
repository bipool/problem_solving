import java.util.HashMap;

/**
 * Created by zulfiquer on 1/6/18.
 */
public class Fibonacci {

    private HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    public int getFibonacci(int n) {

        if ( n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }

        if (map.containsKey(n)) {
            return map.get(n);
        }

        return getFibonacci(n-1) + getFibonacci(n-2);
    }

}
