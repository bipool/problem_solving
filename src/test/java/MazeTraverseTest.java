import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zulfiquer on 2/2/18.
 */
public class MazeTraverseTest {

    private MazeTraverse mazeTraverse = new MazeTraverse();

    @Test
    public void traverse() throws Exception {

        int[][] maze = { {1, 12, 11, 10},
                         {2, 13, 16, 9 },
                         {3, 14, 15, 8},
                         {4, 5,  6, 7}};
        mazeTraverse.traverse(maze);
    }

}