public class Partition {
    private static void partition (LinkedListNode node, int partition) {
        LinkedListNode head = node;
        LinkedListNode tail = node;
        while (node != null) {
            if (node.data < partition) {
                node.next = head;
                head = node;
            } else {
                node.next = tail;
                tail = node;
            }
            node = node.next;
        }
        tail.next = null;
    }
}
