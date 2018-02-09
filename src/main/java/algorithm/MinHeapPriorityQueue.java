package algorithm;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by zulfiquer on 1/14/18.
 */
class MyComparator implements Comparator<Integer>
{
    public int compare( Integer x, Integer y )
    {
        return y - x;
    }
}

public class MinHeapPriorityQueue {


    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new MyComparator());
    }

}
