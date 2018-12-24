public class ClosestPairSorted {


    public int[] closestPair(int[] args, int value) {

        int result[] = {0,0};
        int l = 0, r= args.length -1, diff = Integer.MAX_VALUE;

        while (l < r) {

            int sumOfPair = args[l] + args[r];
            if (Math.abs(sumOfPair - value) < diff) {
                diff = Math.abs(args[l] + args[r] - value);
                result[0] = l;
                result[1] = r;


            }


            if (sumOfPair > value) r--;
            else l++;



        }


        return result;


    }
}
