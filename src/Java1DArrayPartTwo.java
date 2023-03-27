//https://www.hackerrank.com/challenges/java-1d-array/problem?isFullScreen=true
import java.util.*;

public class Java1DArrayPartTwo {

    public static boolean canWin(int leap, int[] game) {
        int arrayLength = game.length;
        try {
            int i = 0;
            // for(int i = 0; i < arrayLength; i++) {
            if(i + leap >= arrayLength || i == arrayLength - 1) {
                return true;
            }
            if (i + 1 == 0) {

            }
            return true;
            // }
        } catch (Exception e) {
            return false;
        }
        // Return true if you can win the game; otherwise, return false.
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}