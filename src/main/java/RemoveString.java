import java.util.HashMap;

/**
 * Created by zulfiquer on 9/25/17.
 */
public class RemoveString {


    public String removeString(String str, String match) {
        if ( str == null || str.length() == 0 || match == null || match.length() == 0) {
            return str;
        }

        char[] matchChars = match.toCharArray();

        // put in hash map
        HashMap<Character, Boolean> map = new HashMap();
        for (char c: matchChars) {
            map.put(c, true);
        }



        StringBuilder sb = new StringBuilder(str);
        int src = 0;
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (!map.containsKey(c)) {
                sb.setCharAt(src, c);
                src++;
            }
        }

        sb.delete(src, sb.length());

        return sb.toString();
    }
}
