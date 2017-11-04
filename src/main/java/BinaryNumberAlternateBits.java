/**
 * Created by zulfiquer on 10/8/17.
 */
public class BinaryNumberAlternateBits {

    public boolean hasAlternatingBits(int num) {
        String binaryStr = Integer.toBinaryString(num);

        int len = binaryStr.length();
        if (len <= 1) {
            return true;
        }


        char expected = binaryStr.charAt(0) == '1' ? '0' : '1';
        for (int i = 1; i < len; i++ ) {
            if (binaryStr.charAt(i) != expected) {
                return  false;
            }

            expected = binaryStr.charAt(i) == '1' ? '0' : '1';
        }

        return true;

    }



}
