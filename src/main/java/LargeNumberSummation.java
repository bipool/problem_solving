/**
 * Created by zulfiquer on 10/1/17.
 */
public class LargeNumberSummation {


    public String sum(final String number1, final String number2) {
        if (number1 == null || number2 == null) {
            return "0";
        }

        final int len1 = number1.length();
        final int len2 = number2.length();

        if (len1 == 0 && len2 == 0) {
            return "0";
        }


        if ( len1 == 0) {
            return  number2;
        }

        if( len2 == 0) {
            return number1;
        }

        int len = len1 > len2 ? len1 : len2;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < len; i++) {
            int num1 = getNumber(number1, len1-1-i);
            int num2 = getNumber(number2, len2-1-i);

            int total = num1 + num2 + carry;
            carry = total / 10;
            int num = total % 10;
            result.insert(0, num);
        }

        if ( carry == 1) {
            result.insert(0, 1);
        }

        return result.toString();

    }



    private int getNumber(String str, int index) {
        if ( index < 0) {
            return 0;
        }

        return str.charAt(index) - 48;
    }
}
