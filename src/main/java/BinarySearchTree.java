import algorithm.TreeNode;

/**
 * Created by zulfiquer on 1/17/18.
 */
public class BinarySearchTree {

    public void buildBST(int arr[]) {
        TreeNode tree = build(arr, 0, arr.length -1);
    }


    private TreeNode build(int[] arr, int start, int end) {
        if ( start > end ) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = build(arr, 0, mid-1);
        root.right = build(arr, mid+1, end);

        return root;
    }
}
