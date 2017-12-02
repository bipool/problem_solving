import java.util.ArrayList;
import java.util.List;

/**
 * Created by zulfiquer on 11/27/17.
 */
public class FizzBuzz {

    public List<String> calculate(int n) {

        List<String> res = new ArrayList<String>();
        for ( int i = 1; i <= n; i++) {

            if ( i % 3 == 0 && i % 5 == 0) {
                res.add("FIzzBUzz");
            } else if ( i % 3 == 0) {
                res.add( "FIzz");
            } else if (i % 5 == 0) {
                res.add("BUzz");
            }else {
                res.add(Integer.toString(i));
            }
        }

        return res;

    }


}
