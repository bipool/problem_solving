import java.util.LinkedList;

/**
 * Created by zulfiquer on 2/2/18.
 */
public class QueueForStack {
    LinkedList<Integer> queue = new LinkedList<Integer>();


    public void push(int value) {
        queue.add(value);
    }

    public int pop(){
        queue.poll();
    }
}
