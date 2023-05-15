public class KthToLast {
    private static LinkedListNode ReturnKthToLast (LinkedListNode head, int k) {
        LinkedListNode firstPointer = head;
        LinkedListNode secondPointer = head;
        for (int i = 0; i < k; i++) {
            if (firstPointer == null) {
                return null;
            }
            firstPointer = firstPointer.next;
        }
        while (firstPointer != null) {
            firstPointer = firstPointer.next;
            secondPointer = secondPointer.next;
        }
        return secondPointer;
    }
}

