import java.util.*;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        if (A.length() == 1) {
            System.out.print("Yes");
            return;
        }
        for(int i = 0; i < Math.ceil(A.length() / 2) ; i++) {
            String x = A.substring(i, i + 1);
            String y = A.substring(A.length() - i - 1, A.length() - i);
            if (x.compareTo(y) == 0) {
                if (Math.ceil(A.length() / 2) - i == 1) {
                    System.out.print("Yes");
                }
            } else {
                System.out.print("No");
                break;
            }
        }
    }
}




