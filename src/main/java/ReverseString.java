/**
 * Created by zulfiquer on 11/27/17.
 */
public class ReverseString {

    public String reverse(String str) {
        if ( str == null) {
            return null;
        }


        int len = str.length();
        if ( len <= 1) {
            return str;
        }

        char[] chars = str.toCharArray();
        for (int i = 0; i < len/2; i++) {
            char temp = chars[i];
            chars[i] = chars[len-i- 1];
            chars[len -i -1] = temp;
        }

        return String.valueOf(chars);

    }
}
