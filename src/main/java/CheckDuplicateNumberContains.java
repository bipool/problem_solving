import java.util.HashMap;

/**
 * Created by zulfiquer on 9/23/17.
 */
public class CheckDuplicateNumberContains {

    public boolean checkDuplicate(int[] input) {

        if (input.length == 0) {
            return false;
        }


        HashMap<Integer, Boolean> map = new HashMap();
        for (int i : input) {
            if (map.containsKey(i) && map.get(i)) {
                return true;
            }

            map.put(i, true);
        }

        return false;
    }
}
