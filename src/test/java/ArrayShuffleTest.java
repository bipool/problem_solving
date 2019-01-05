import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayShuffleTest {

    private ArrayShuffle arrayShuffle = new ArrayShuffle();

    @Test
    public void shuffle() {
        int[] data = {1, 2, 3, 4, 5};
        arrayShuffle.shuffle(data);

        System.out.println(Arrays.toString(data));

    }
}