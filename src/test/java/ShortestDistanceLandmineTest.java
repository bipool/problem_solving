import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShortestDistanceLandmineTest {

    private ShortestDistanceLandmine landmine = new ShortestDistanceLandmine();


    @Test
    public void testSimpleCase() {

        char[][] maze = {
                {'O', 'M', 'O', 'O', 'X'},
                {'O', 'X', 'X', 'O', 'M'},
                {'O', 'O', 'O', 'O', 'O'},
                {'O', 'X', 'X', 'X', 'O'},
                {'O', 'O', 'M', 'O', 'O'},
                {'O', 'X', 'X', 'M', 'O'}};

        int[][] res = landmine.calculate(maze);

        int[][] exp = {
                {1,  0,  1,  2, -1},
                {2, -1, -1,  1,  0},
                {3,  4,  3,  2,  1},
                {3, -1, -1, -1,  2},
                {2,  1,  0,  1,  2},
                {3, -1, -1,  0,  1}
        };
        Assert.assertArrayEquals(exp, res);
    }

}