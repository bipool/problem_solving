/**
 * Created by zulfiquer on 11/5/17.
 */
public class LongestUncommonSequence {


    private int[][] computeDpTable(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        int[][] lcs = new int[len1  +1 ][len2 + 1];
        for (int i = 0 ; i <= str1.length(); i++) {
            for (int j = 0; j <= str2.length(); j++) {

                if ( i == 0 || j == 0) {
                    lcs[i][j] = 0;
                }

                else if (str1.charAt(i-1) != str2.charAt(j-1)) {
                    lcs[i][j] = lcs[i-1][j-1] + 1;
                }

                else {
                    lcs[i][j] = lcs[i][j-1] > lcs[i-1][j] ? lcs[i][j-1] : lcs[i-1][j];
                }
            }
        }

        return lcs;
    }

    public int findLength(String str1, String str2) {

        if ( str1 == null || str2 == null || str1.length() == 0 || str2.length() == 0) {
            return 0;
        }

        int[][] lcs = computeDpTable(str1, str2);

        return lcs[str1.length()][str2.length()];
    }
}
