public class DeleteMiddleNode {
    private boolean deleteMiddleNode (LinkedListNode node) {
        if (node == null || node.next == null) {
            return false;
        }
        node.next = node.next.next;
        node.data = node.next.data;
        return true;
    }
}
