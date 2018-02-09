/**
 * Created by zulfiquer on 1/8/18.
 */
public class MinHeap extends TreeUtil{



    public int peek() {
        if (current == -1) throw new IllegalStateException();

        return tree[current];
    }


    public void poll() {
        if (current == -1) throw new IllegalStateException();

        int rootValue = tree[0];
        tree[0] = tree[current];
        current--;
        heapifyDown();

    }


    public void add(int value) {
        current++;
        if (current >= tree.length) {
            // increate size
        }

        tree[current] = value;
        heapifyUp();



    }

    private void heapifyUp() {
        int currentIndex = current;
        int currentValue = tree[current];
        while (getParentIndex(currentIndex)  >= 0 && getParent(currentIndex) > currentValue) {
            swap(getParentIndex(currentIndex), currentIndex);
            currentIndex = getParentIndex(currentIndex);
        }
    }

    private void swap(final int parentIndex, final int currentIndex) {

        int tmp = tree[parentIndex];
        tree[parentIndex] = tree[currentIndex];
        tree[currentIndex] = tmp;
    }


    private void heapifyDown() {
        int currentIndex = 0;
        int currentValue = tree[currentIndex];

        while (hasLeftChild(currentIndex)) {

            int smallerChildIndex = getLeftIndex(currentIndex);
            if(hasRightChild(currentIndex) && getLeft(currentIndex) > getRight(currentIndex)) {
                smallerChildIndex = getRightIndex(currentIndex);
            }


            if (tree[smallerChildIndex] > currentValue) {
                break;
            }


            swap(currentIndex, smallerChildIndex);
            currentIndex = smallerChildIndex;

        }
    }


    public void display() {
        for (int i = 0; i <=current; i++) {
            System.out.println(tree[i]);
        }
    }


}
