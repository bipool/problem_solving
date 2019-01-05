import org.junit.Test;

import static org.junit.Assert.*;

public class SimplifyUnixPathTest {

    private SimplifyUnixPath simplifyUnixPath = new SimplifyUnixPath();


    @Test
    public void testSimplePath() {
        String path = "/a/b/";
        String res = simplifyUnixPath.getPath(path);

    }

}