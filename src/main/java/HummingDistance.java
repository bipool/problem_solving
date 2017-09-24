/**
 * Created by zulfiquer on 9/24/17.
 */
public class HummingDistance {

    public int hammingDistance(int x, int y) {
        if ( x == y) {
            return 0;
        }

        int count = 0;
        int result = x^y;
        while (result > 0) {
            count++;
            result &= result -1;
        }

        return count;
    }
}
