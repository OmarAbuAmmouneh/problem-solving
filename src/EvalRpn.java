import java.util.ArrayList;
import java.util.Stack;

public class EvalRpn {

    public static int evalRPN(String[] tokens) {
        ArrayList<String> list = new ArrayList<>();
        list.add("+");
        list.add("-");
        list.add("*");
        list.add("/");
        // Loop through the string
        // If it is an operand push it to the stack
        // If it is operator, peek the last two values, do the operation and then push again
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String s = tokens[i];
            if (!list.contains(s)) {
                stack.push(Integer.valueOf(s));
            } else {
                int a = stack.pop();
                int b = stack.pop();
                int result = 0;
                if (s.equals("+")) {
                    result = a + b;
                } else if (s.equals("-")) {
                    result = b - a;
                } else if (s.equals("*")) {
                    result = b * a;
                } else if (s.equals("/")) {
                    result = b / a;
                }
                stack.push(result);
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        String[] tokens = {"4","13","5","/","+"};
        int num = evalRPN(tokens);
        System.out.println(num);
    }
}
