import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zulfiquer on 1/8/18.
 */
public class MinHeapTest {
    private MinHeap minHeap = new MinHeap();

    @Before
    public void setup() {
        minHeap.add(10);
        minHeap.add(20);
        minHeap.add(15);
        minHeap.add(8);
        minHeap.add(9);
        minHeap.display();
    }


    @Test
    public void peek() throws Exception {
        Assert.assertEquals(10, minHeap.peek());

    }

    @Test
    public void poll() throws Exception {
        minHeap.poll();

    }

    @Test
    public void add() throws Exception {
        minHeap.add(14);
    }

    @After
    public void complete() {
        System.out.println("-----------------");
        minHeap.display();
        System.out.println("--------Complete---------");
    }

}