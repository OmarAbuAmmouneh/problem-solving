import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;

class StackOfPlates {
    public ArrayList<Stack> stacks = new ArrayList<>();
    public int capacity;
    public StackOfPlates(int capacity) {
        this.capacity = capacity;
    }
    public void push(int value) {
       Stack lastStack = getLastStack();
       if (isFull()) {
           Stack newStack = new Stack();
           newStack.push(value);
           stacks.add(newStack);
       }
       lastStack.push(value);
    }
    public int pop() {
        Stack lastStack = getLastStack();
        if (lastStack == null) throw new EmptyStackException();
        int removedItem = (int) lastStack.pop();
        if (lastStack.isEmpty()) {
            stacks.remove(stacks.size() - 1);
        }
        return removedItem;
    }
    public Stack getLastStack() {
        return stacks.get(stacks.size() - 1);
    }
    public boolean isFull() {
        return getLastStack().size() == capacity;
    }
    public int popAtIndex(int index) {
        return leftShift(index);
    }
    public int leftShift(int index) {
        Stack stack = stacks.get(index);
        int removedItem = (int) stack.pop();
        if (stack.isEmpty()) {
            stacks.remove(index);
        } else if (stack.size() > index + 1) {
            int x = leftShift(index + 1);
            stack.push(x);
        }
        return removedItem;
    }
}
