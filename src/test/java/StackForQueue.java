import java.util.Stack;

/**
 * Created by zulfiquer on 2/2/18.
 */
public class StackForQueue {


    private Stack<Integer> stack1 = new Stack<Integer>();
    private Stack<Integer> stack2 = new Stack<Integer>();


    public void enqueue(int value) {
        stack1.push(value);
    }


    public int dequeue() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        int value = stack2.pop();

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

        return value;
    }


    public void enqueueCostly(int value) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        stack1.push(value);

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public int enqueueCostlyDequeue() {
        return stack1.pop();
    }

}
