public class LinkedListIntersection {
    private static boolean intersection(LinkedListNode l1, LinkedListNode l2) {
        if (l1 == null || l2 == null) return false;
        while (l1 != null) {
            while (l2 != null) {
                if (l2 == l1) return true;
                l2 = l2.next;
            }
            l1 = l1.next;
        }
        return false;
    }
}
