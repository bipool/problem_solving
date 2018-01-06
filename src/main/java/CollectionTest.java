import java.util.*;
import java.util.concurrent.*;

/**
 * Created by zulfiquer on 12/28/17.
 */
public class CollectionTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("Bipool");
        list.add("Fahin");
        list.add("Aymaan");

        Set<String> setNames = new TreeSet<String>();
        setNames.addAll(Arrays.asList("Tom", "Peter", "Alice", "Bob", "Sam", "Mary", "Jane", "Bill", "Tim", "Kevin"));
        System.out.println(setNames);


        ListIterator listIter = list.listIterator();

        while (listIter.hasNext()) {

            System.out.println(listIter.next());
        }

        while (listIter.hasPrevious()) {

            System.out.println(listIter.previous());
        }

        for(String str: list) {
            System.out.println(str);
        }
    }
}
