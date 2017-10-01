package algorithm;

/**
 * Created by zulfiquer on 10/1/17.
 */
public class BinaryTreeNode {

    private int key;
    private BinaryTreeNode leftNode = null;
    private BinaryTreeNode rightNode = null;


    public BinaryTreeNode(int value) {
        key = value;
    }

    public int getKey() {
        return key;
    }

    public void setKey(final int key) {
        this.key = key;
    }

    public BinaryTreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(final BinaryTreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public BinaryTreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(final BinaryTreeNode rightNode) {
        this.rightNode = rightNode;
    }
}
