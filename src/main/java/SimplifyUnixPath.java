import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class SimplifyUnixPath {

    public String getPath(String path) {
        if(path.length() == 0 || path.equals('/')) {
            return path;
        }

        if(path.charAt(0) == '/') {
            path = path.substring(1);
        }

        Stack<String> dirs = new Stack<String>();
        StringTokenizer tokenizer = new StringTokenizer(path, "/");
        while (tokenizer.hasMoreElements()) {
            String token = tokenizer.nextToken();
            if (token.equals(".")) {
                continue;
            }


            if(token.equals("..") ) {
                if(!dirs.empty())
                    dirs.pop();

                continue;
            }


            dirs.push(token);

        }



        if (dirs.empty()) {
            return "/";
        }
        StringBuffer res = new StringBuffer();

        while (!dirs.empty()) {
            res.insert(0, "/"+ dirs.pop());
        }

        return res.toString();

    }
}
