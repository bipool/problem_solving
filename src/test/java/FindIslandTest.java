import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zulfiquer on 12/12/17.
 */
public class FindIslandTest {

    private FindIsland island = new FindIsland();

    @Test
    public void numberOfIsland_valid_test() {

        char[][] graph = {{'1', '1', '0', '1'},
                         {'1', '1', '0', '1'},
                         {'0', '0', '0', '1'},
                         {'1', '1', '0', '0'}
                        };
        int count = island.numberOfIsland(graph);
        Assert.assertEquals(3, count);
    }

    @Test
    public void numberOfIsland_zero_test() {
        char[][] graph = {{'0', '0', '0', '0'},
                        {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'}
        };
        int count = island.numberOfIsland(graph);
        Assert.assertEquals(0, count);
    }


    @Test
    public void numberOfIsland_all_test() {
        char[][] graph = {{'1', '1', '1', '1'},
                {'1', '1', '1', '1'},
                {'1', '1', '1', '1'},
                {'1', '1', '1', '1'}};
        int count = island.numberOfIsland(graph);
        Assert.assertEquals(1, count);
    }

    @Test
    public void numberOfIsland_one_test() {
        char[][] graph = {{'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '1', '0', '0'},
                {'0', '0', '0', '0'},
        };
        int count = island.numberOfIsland(graph);
        Assert.assertEquals(1, count);
    }
}