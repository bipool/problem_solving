package algorithm;

public class TreeNode {
    private int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }


    public int getVal() {
        return val;
    }

    public void setVal(final int val) {
        this.val = val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(final TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(final TreeNode right) {
        this.right = right;
    }
}
