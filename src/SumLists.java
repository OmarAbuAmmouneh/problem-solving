public class SumLists {
    private static LinkedListNode sumLists (LinkedListNode list1, LinkedListNode list2, int carry) {
        int value = carry;
        LinkedListNode result = new LinkedListNode();
        if (list1 == null && list2 == null) {
            return result;
        }
        if (list1 != null) {
            value += list1.data;
        }
        if (list2 != null) {
            value += list2.data;
        }
        result.data = value;
        if (list1 != null || list2 != null) {
            LinkedListNode more = sumLists(list1 == null ? null : list1.next,list2 == null ? null : list2.next, value >= 10 ? 1 : 0);
            result.setNext(more);
        }
        return result;
    }
}
