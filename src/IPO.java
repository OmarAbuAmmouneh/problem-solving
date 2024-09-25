import java.util.HashMap;

public class IPO {
    public static int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        while (k > 0) {
            int value = getMaxProfit(profits, capital, w);
            w += value;
            k--;
        }
        return w;
    }

    public static int getMaxProfit (int[] profits, int[] capital, int w) {
        int largest = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < capital.length; i++) {
            if (w >= capital[i] && profits[i] != -1 && profits[i] > largest) {
                largest = profits[i];
                index = i;
            }
        }
        if (index != -1) {
            capital[index] = -1;
            profits[index] = -1;

        }
        return largest == Integer.MIN_VALUE ? 0 : largest;
    }

    public static void main (String args[]) {
        int[] capital = {0, 1, 1};
        int[] profits = {1, 2, 3};
        int value = findMaximizedCapital(2, 0, profits, capital);
        System.out.println(value);
    }
}
