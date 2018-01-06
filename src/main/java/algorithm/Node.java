package algorithm;

/**
 * Created by zulfiquer on 1/3/18.
 */
public class Node {
    private Object key;
    private Object value;
    private Node next = null;

    public Node(final Object key, final Object value) {
        this.key = key;
        this.value = value;
    }

    public Object getKey() {
        return key;
    }

    public void setKey(final Object key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(final Object value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(final Node next) {
        this.next = next;
    }
}
