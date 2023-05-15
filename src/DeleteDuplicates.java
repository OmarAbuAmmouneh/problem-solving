import java.util.HashSet;

class LinkedListNode {
    public LinkedListNode next;
    public int data;
}

public class DeleteDuplicates {
    private static void deleteDuplicates (LinkedListNode node) {
        HashSet<Integer> set = new HashSet<>();
        LinkedListNode previous = null;
        while (node != null) {
            if (set.contains(node.data)) {
                previous.next = node.next;
            } else {
                previous = node;
                set.add(node.data);
            }
            node = node.next;
        }
    }
}
