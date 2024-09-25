import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CoinChange {
    public static int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        int count = 0;
        int n = coins.length;
        Arrays.sort(coins);
        int i = 0;
        while (amount > 0 && i < n) {
            if (amount >= coins[i]) {
                amount -= coins[i];
                count++;
            }
            if (amount < coins[i]) {
                i++;
            }
        }

        return amount == 0 ? count : -1;
    }

    public static void main (String args[]) {
        int amount = 6249;
        int[] coins = {186,419,83,408};
        int x = coinChange(coins, amount);
        System.out.println(x);
    }
}