import java.util.EmptyStackException;

class StackMin {
    public int top;
    public int[] stack;
    public int min;

    public void push(int value) {
        //You need to resize the array if needed, but we won't do it here
        if (top == stack.length) return;
        if (value < min) {
            min = value;
        }
        stack[top] = value;
        top++;
    }
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int removedItem = stack[top - 1];
        stack[top - 1] = 0;
        top--;
        if (min == removedItem) {
            setNewMin();
        }
        return removedItem;
    }
    public void setNewMin() {
        if (stack.length == 0) {
            min = 0;
            return;
        }
        for (int i = 0; i < top; i++) {
            if (i == 0) min = stack[i];
            else if (stack[i] < min) min = stack[i];
        }
    }
    public boolean isEmpty() {
        return top == 0;
    }
}
