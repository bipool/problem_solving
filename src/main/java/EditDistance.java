/**
 * Created by zulfiquer on 11/5/17.
 */
public class EditDistance {

    private int min(int x, int y, int z) {
        if (x <= y && x <= z) {
            return  x;
        }

        if( y <= x && y <= z) {
            return y;
        }

        return z;
    }

    private int[][] computeDistance(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        int[][] distanceTable = new int[len1+1][len2+1];

        for (int i = 0; i <= len1; i++) {
            for (int j = 0; j <= len2; j++) {

                if ( i == 0) {
                    distanceTable[i][j] = j;
                }

                else if (j == 0) {
                    distanceTable[i][j] = i;
                }

                else if (str1.charAt(i-1) == str2.charAt(j-1)) {
                    distanceTable[i][j] = distanceTable[i-1][j-1];
                }

                else {
                   distanceTable[i][j] = min(distanceTable[i-1][j],
                                             distanceTable[i-1][j-1],
                                             distanceTable[i][j-1]
                                            ) + 1;
                }

            }
        }

        return distanceTable;
    }

    public int findNumberOfOperation(String str1, String str2) {

        if ( (str1 == null && str2 == null) || (str1.length() == 0 && str2.length() == 0) ) {
            return 0;
        }

        if (str1.length() == 0 && str2.length() > 0) {
            return str2.length();
        }

        if (str1.length() > 0 && str2.length() == 0) {
            return str1.length();
        }


        int[][] distanceTable = computeDistance(str1, str2);

        return distanceTable[str1.length()][str2.length()];
    }

}
