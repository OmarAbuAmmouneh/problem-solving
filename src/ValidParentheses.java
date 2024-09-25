import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        // Loop over the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsValue(c)) {
                stack.push(c);
            } else if (!stack.isEmpty() && map.get(c) == stack.peek()) {
                stack.pop();
            } else return false;
        }
        return stack.isEmpty();

    }
    public static void main (String[] args) {
        boolean val =  isValid("()[]{}");
    }
}
