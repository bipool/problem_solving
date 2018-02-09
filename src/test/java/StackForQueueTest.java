import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zulfiquer on 2/2/18.
 */
public class StackForQueueTest {

    private StackForQueue stackForQueue = new StackForQueue();

    @Test
    public void testQueue() {
//        stackForQueue.enqueue(1);
//        stackForQueue.enqueue(2);
//        stackForQueue.enqueue(3);
//
//        System.out.println(stackForQueue.dequeue());

        stackForQueue.enqueueCostly(1);
        stackForQueue.enqueueCostly(2);
        stackForQueue.enqueueCostly(3);
        System.out.println(stackForQueue.enqueueCostlyDequeue());
    }

}