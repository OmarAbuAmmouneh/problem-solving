//https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
import java.util.Scanner;

public class JavaStringCompare {

    public static String getSmallestAndLargest(String s, int k) {
        //Find the largest
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        for (int i = 1; i <= s.length() - k; i++) {
            String subString = s.substring(i, k + i);
            if (subString.compareTo(largest) > 0) {
                largest = subString;
            }
            if (subString.compareTo(smallest) < 0) {
                smallest = subString;
            }
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}

