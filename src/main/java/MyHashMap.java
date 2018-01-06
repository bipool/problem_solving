import algorithm.Node;

/**
 * Created by zulfiquer on 1/3/18.
 */
public class MyHashMap {

    private int bucketSize = 100;
    private Node bucket[] = new Node[bucketSize];

    private int hashCode(Object key) {
        if (key == null) {
            return 0;
        }

        return (key.hashCode() + 7) % bucketSize;
    }

    public void put(Object key, Object value) {
        int position = hashCode(key);
        Node head = bucket[position];
        boolean found = false;

        if(head == null) {
            bucket[position] = getNode(key, value);
            return;
        }


        do {
            if (head.getKey().equals(key) ) {
                head.setValue(value);
                break;
            }

            head = head.getNext();
        }while (head.getNext() != null);


        head.setNext(getNode(key, value));
    }


    public Object get(Object key) {
        int position = hashCode(key);
        Node head = bucket[position];

        if (head == null) {

            return null;
        }


         do {
            if(head.getKey().equals(key)) {
                return head.getValue();
            }

            head = head.getNext();
        }while (head != null);

        return null;
    }


    private Node getNode(Object key, Object value) {
        return new Node(key, value);
    }
}
