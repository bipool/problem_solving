import java.util.ArrayList;
import java.util.List;

/**
 * Created by zulfiquer on 11/27/17.
 */
public class FindDuplicate {

    public List<Integer> find(int[] nums) {

        List<Integer> res = new ArrayList<Integer>();
        if (nums.length <= 1) {
            return res;
        }


        for (int i = 0; i < nums.length; i++) {

            int numIndex = Math.abs(nums[i]) - 1;

            if (nums[numIndex] < 0) {
                res.add(Math.abs(numIndex + 1));
            }

            nums[numIndex] = nums[numIndex] * -1;
        }

        return res;

    }
}
