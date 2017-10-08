import algorithm.TreeNode;

/**
 * Created by zulfiquer on 10/8/17.
 */
public class MaxBinaryTree {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length == 0) {
            return  null;
        }

        return buildMaxBinaryTree(nums, 0, nums.length-1);
    }



    private TreeNode buildMaxBinaryTree(int[] nums, int start, int end) {
        if ( start > end) {
            return null;
        }

        int maxIndex = findMaxIndex(nums, start, end);

        TreeNode root = new TreeNode(nums[maxIndex]);
        root.left = buildMaxBinaryTree(nums, start, maxIndex-1);
        root.right = buildMaxBinaryTree(nums, maxIndex + 1, end);

        return root;
    }



    private int findMaxIndex(int[] nums, int start, int end) {
        if ( start == end) {
            return start;
        }

        int maxIndex = start;
        for (int i = start + 1; i < end; i++) {
            if ( nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}
