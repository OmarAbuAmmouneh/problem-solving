import java.util.Stack;

public class BasicCalculator {
    public static int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int number = 0;
        int result = 0;
        int sign = 1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // Is number
            if (Character.isDigit(c)) {
                number = number * 10 + (c - '0');
            } else if (c == '+') {
                result += number * sign;
                number = 0;
                sign = 1;
            } else if (c == '-') {
                result += number * sign;
                number = 0;
                sign = -1;
            } else if (c == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;

            } else if (c == ')') {
                result += number * sign;
                number = 0;
                result += stack.pop();
                result *= stack.pop();
            }
        }
        if (number != 0) {
            result += number * sign;
        }
        return result;
    }

    public static void main(String[] args) {
        int num = calculate("(1+(4+5+2)-3)+(6+8)");
        System.out.println(num);
    }
}

