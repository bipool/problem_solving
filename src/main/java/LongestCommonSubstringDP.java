import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestCommonSubstringDP {


    public int calculateSubstr(final String str1, final String str2){
        int max = 0;
        List<String> substrList = new ArrayList<>();


        int[] table = new int[str1.length()];

        for (int i = 0; i < str2.length(); i++) {
            for (int j = str1.length() -1; j >= 0 ; j--) {

                if ( str1.charAt(j) == str2.charAt(i)) {

                    table[j] = j == 0 ? 1 : table[j-1] + 1;
                    if (max < table[j]){
                        max = table[j];
                    }

                    substrList.add(str1.substring(j+1 - table[j], j+1));
                }

            }
        }

        substrList.forEach(System.out::println);

        return max;
    }
}
