import algorithm.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zulfiquer on 10/8/17.
 */
public class MaxBinaryTreeTest {
    private MaxBinaryTree maxBinaryTree = new MaxBinaryTree();

    @Test
    public void constructMaximumBinaryTree_empty_test() throws Exception {
        int[] nums = new int[0];
        TreeNode root = maxBinaryTree.constructMaximumBinaryTree(nums);
        Assert.assertEquals(null, root);
    }


    @Test
    public void constructMaximumBinaryTree_valid() throws Exception {

    }

}