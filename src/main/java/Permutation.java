public class Permutation {
    public  void getPermutation(String str) {
        permutation("", str);
    }

    private  void permutation(String prefix, String str) {
        int n = str.length();
        System.out.println(prefix);
        if (n == 0 )
            return;
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }
}


