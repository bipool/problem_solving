import java.util.HashMap;

/**
 * Created by zulfiquer on 1/11/18.
 */
public class BirthdayHeight {

    public int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
        int max = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for ( int i = 0 ; i < n; i++) {
            max = ar[i] > max ? ar[i] : max;
            if ( map.containsKey(ar[i])){
                map.put(ar[i], map.get(ar[i]) + 1 );
            } else {
                map.put(ar[i], 1);
            }
        }

        return map.get(max);
    }


    public String timeConversion(String s) {

        String time = s.substring(0, 8);
        boolean isTwelve = time.substring(0,2).equals("12");
        char[] timeChar = time.toCharArray();

        if (isTwelve) {
            timeChar[0] = '0';
            timeChar[1] = '0';
        }

        if (s.charAt(8) == 'A') {
            if (isTwelve)
                return String.valueOf(timeChar);

            return time;
        }



        int hour = timeChar[0] == '0' ? Integer.parseInt(String.valueOf(timeChar[1])) : Integer.parseInt(time.substring(0, 2));
        hour += 12;

    String h = String.valueOf(hour);
        return h + time.substring(2, 8);
    }
}
