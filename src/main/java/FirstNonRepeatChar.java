import java.util.HashMap;

/**
 * Created by zulfiquer on 9/23/17.
 */
public class FirstNonRepeatChar {

    public Character findFirstNonRepeatChar(String str) {
        if( str == null || str.length() == 0) {
            return null;
        }

        if (str.length() == 1) {
            return str.charAt(0);
        }

        final char[] chars = str.toCharArray();
        HashMap<Character, Boolean> charMap = new HashMap();
        for (char c : chars) {
            charMap.put(c, charMap.containsKey(c));
        }

        for (char c: chars) {
            if (charMap.containsKey(c) && !charMap.get(c)) {
                return c;
            }
        }

        return null;
    }

}
