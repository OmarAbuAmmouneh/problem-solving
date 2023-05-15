import java.util.Stack;

public class LinkedListPalindrome {
    private static boolean isPalindrome (LinkedListNode l1) {
        if (l1 == null) return false;
        Stack<Integer> stack = new Stack<>();
        while (l1 != null) {
            stack.push(l1.data);
            l1 = l1.next;
        }
        while (l1 != null) {
            int i = stack.pop();
            if (i != l1.data) {
                return false;
            }
            l1 = l1.next;
        }
        return true;
    }
}
