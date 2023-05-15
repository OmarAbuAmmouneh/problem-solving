import java.util.HashSet;

public class LinkedListLoopDetection {
    private static boolean loopDetection (LinkedListNode list) {
        if (list == null) return false;
        HashSet<LinkedListNode> set = new HashSet<>();
        while (list != null) {
            if (set.contains(list)) return true;
            set.add(list);
        }
        return false;
    }
}
