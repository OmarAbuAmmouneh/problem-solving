import java.util.Stack;

public class SortStack {
    public void sortStack (Stack<Integer> s) {
        Stack<Integer> r = new Stack<>();
        while (!s.isEmpty()) {
            int tmp  = s.pop();
            while (!r.isEmpty() && tmp > r.peek()) {
                s.push(r.pop());
            }
            r.push(tmp);
        }
        while (!r.isEmpty()) {
            s.push(r.pop());
        }
    }
}
