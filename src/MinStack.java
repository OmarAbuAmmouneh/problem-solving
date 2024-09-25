import java.util.Stack;

public class MinStack {
        public Stack<Integer> numbers;
        public Stack<Integer> minStack;
        public MinStack() {
            numbers = new Stack<>();
            minStack = new Stack<>();
        }

        public void push(int val) {
            numbers.push(val);
            if (minStack.isEmpty() || val <= minStack.peek()) {
                minStack.push(val);
            }
        }

        public void pop() {
            int val = numbers.pop();
            if (minStack.peek() == val) {
                minStack.pop();
            }
        }

        public int top() {
            return numbers.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
}
