import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Combinations {
        static List<List<Integer>> result = new ArrayList<>();

        public static List<List<Integer>> combine(int n, int k) {
            List<Integer> list = new ArrayList<>();
            if (n == 1) {
                list.add(n);
                result.add(list);
                return result;
            }
            backTrack(list, n);
            return result;
        }

    private static void backTrack(List<Integer> list, int n) {
        if (list.size() == 2) {
            result.add(list);
            return;
        }

        for (int i = 1; i <= n; i++) {
            int temp = i + 1;
            while(n >= temp) {
                list.add(i);
                list.add(temp);
                List<Integer> newList = new ArrayList<>(list);
                backTrack(newList, n);
                temp++;
                list.clear();
            }
            list.clear();
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> r = combine(2, 1);
    }
}
