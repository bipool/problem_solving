import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SearchRangeTest {

    private SearchRange range = new SearchRange();

    @Test
    public void testRange() {
        int[] data = {8,8,8, 8, 8,8};
        int[] result = range.find(data, 8);

        Arrays.stream(result).forEach(System.out::println);
        System.out.println(Arrays.toString(result));
    }

}