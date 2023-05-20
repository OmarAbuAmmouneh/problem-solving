import java.util.Stack;

public class QueueViaStacks {
    Stack stackNewest, stackOldest;
    public QueueViaStacks() {
        stackNewest = new Stack();
        stackOldest = new Stack();
    }
    public void add (int value) {
        stackNewest.push(value);
    }
    public void shiftStacks() {
        while (!stackNewest.isEmpty()) {
            stackOldest.push(stackNewest.pop());
        }
    }
    public int remove () {
        shiftStacks();
        return (int) stackOldest.pop();
    }
    public int peek () {
        shiftStacks();
        return (int) stackOldest.peek();
    }
}
