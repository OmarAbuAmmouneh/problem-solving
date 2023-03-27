//https://www.hackerrank.com/challenges/java-negative-subarray/problem?isFullScreen=true
import java.util.*;

public class JavaNegativeSubArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();
        int negativeSumCount = 0;
        for(int i = 0; i < n; i++) {
            int sum = 0;
            for(int j = i; j < n; j++) {
                sum += a[j];
                if (sum < 0) {
                    negativeSumCount++;
                }
            }
        }
        System.out.print(negativeSumCount);
    }
}