import java.util.Stack;

public class SimplifyPath {
    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        String[] parts =  path.split("/");
        for (String c: parts) {
            if (c.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!c.equals(".") && !c.equals("")) {
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            sb.insert(0, "/" + stack.pop());
        }

        return sb.length() == 0 ? "/" : sb.toString();
    }


    public static void main(String[] args) {
        String path = "/home//foo/";
        String path1 = "/../";
        simplifyPath(path);
        simplifyPath(path1);
    }
}
