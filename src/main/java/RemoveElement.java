/**
 * Created by zulfiquer on 11/11/17.
 */
public class RemoveElement {

    public int findLength(int[] nums, int val) {

        if (nums.length == 0) {
            return 0;
        }


        int length = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[length] = nums[i];
                length++;
            }
        }

        return length;
    }
}
