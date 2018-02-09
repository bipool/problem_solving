/**
 * Created by zulfiquer on 1/8/18.
 */
public class TreeUtil {

    protected int[] tree = new int[100];
    protected int current = -1;

    protected int getParentIndex(int index) {
        return (index -1) /2 ;
    }

    protected int getParent(int index) {
        return tree[getParentIndex(index)];
    }


    protected int getRightIndex(int index) {
        return (index + 1) * 2;
    }

    protected int getRight(int index) {
        return tree[getRightIndex(index)];
    }

    protected int getLeftIndex(int index) {
        return (index * 2) + 1;
    }

    protected int getLeft(int index) {
        return tree[getLeftIndex(index)];
    }


    protected boolean hasLeftChild(final int index) {
        return getLeftIndex(index) <= current ;
    }

    protected boolean hasRightChild(final int index) {
        return getRightIndex(index) <= current;
    }

}

