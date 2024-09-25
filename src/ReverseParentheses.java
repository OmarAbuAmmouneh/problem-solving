import java.util.Stack;

public class ReverseParentheses {
    public static String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            if (c == ')') {
                StringBuilder temp = new StringBuilder();

                // Pop from the stack until we find the matching '('
                while (!stack.isEmpty() && stack.peek() != '(') {
                    temp.append(stack.pop());
                }

                // Pop the '(' character
                if (!stack.isEmpty()) {
                    stack.pop();
                }

                // Push the reversed substring back onto the stack
                for (char ch : temp.toString().toCharArray()) {
                    stack.push(ch);
                }
            } else {
                // Push the current character onto the stack
                stack.push(c);
            }
        }

        // Build the result string from the stack
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        // Since we built the string in reverse order, reverse it before returning
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String s = "(ed(et(oc))el)";
        System.out.println(reverseParentheses(s)); // Output: "leetcode"
    }
}
