import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumTotal {

        public static int minimumTotal(List<List<Integer>> triangle) {
            int m = triangle.size();
            int[] dp = new int[m + 1];

            for (int i = m - 1; i >= 0; i--) {
                for (int j = 0; j < triangle.get(i).size(); j++) {
                        int val = triangle.get(i).get(j);
                        int val1 = dp[j];
                        int val2 = dp[j + 1];
                        dp[j] = Math.min(val + val1, val + val2);
                }
            }

            return dp[0];
        }

        public static void main (String args[]) {
            List<List<Integer>> list = new ArrayList<>();
            list.add(Arrays.asList(2));
            list.add(Arrays.asList(3, 4));
            list.add(Arrays.asList(6, 5, 7));
            list.add(Arrays.asList(4, 1, 8, 3));
            int value = minimumTotal(list);
            System.out.println(value);
        }
}
