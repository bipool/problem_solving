package algorithm;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by zulfiquer on 10/1/17.
 */
public class BinarySearchTree {

    private BinaryTreeNode root = null;

    public BinaryTreeNode createBinarySearchTree(int[] input) {
        for (int i = 0; i < input.length; i++) {
            root = insert(root, input[i]);
        }

        return root;
    }


    private BinaryTreeNode insert(BinaryTreeNode root, int value) {
        if ( root == null) {
            return new BinaryTreeNode(value);
        }

        if ( root.getKey() > value) {
            root.setLeftNode(insert(root.getLeftNode(), value));
        } else {
            root.setRightNode(insert(root.getRightNode(), value));
        }

        return root;
    }


    public void inOrderTraverse(BinaryTreeNode root) {

        if ( root != null) {
            inOrderTraverse(root.getLeftNode());
            System.out.println(root.getKey());
            inOrderTraverse(root.getRightNode());
        }

    }

    public void preOrderTraverse(BinaryTreeNode root) {

        if ( root != null) {
            System.out.println(root.getKey());
            preOrderTraverse(root.getLeftNode());
            preOrderTraverse(root.getRightNode());
        }

    }


    public void postOrderTraverse(BinaryTreeNode root) {

        if ( root != null) {
            preOrderTraverse(root.getLeftNode());
            preOrderTraverse(root.getRightNode());
            System.out.println(root.getKey());
        }

    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        int input[] = new int[]{2,3,1,6, 5, 9,11};

        BinaryTreeNode rootNode = tree.createBinarySearchTree(input);
        tree.inOrderTraverse(rootNode);
        tree.preOrderTraverse(rootNode);
        tree.postOrderTraverse(rootNode);
    }







}
