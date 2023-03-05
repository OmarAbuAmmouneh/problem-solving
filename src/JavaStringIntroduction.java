//https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true
import java.util.*;

public class JavaStringIntroduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int length = A.length() + B.length();
        boolean enteredLoop = false;
        String a = A.substring(0,1).toUpperCase() + A.substring(1).toLowerCase();
        String b = B.substring(0,1).toUpperCase() + B.substring(1).toLowerCase();
        System.out.println(length);
        for (int i = 0; i < A.length() &&
                i < B.length(); i++) {
            if (A.equals(B)) {
                System.out.println("No");
                enteredLoop = true;
                break;
            }
            if ((int)A.charAt(i) ==
                    (int)B.charAt(i)) {
                continue;
            }
            else {
                if ((int)A.charAt(i) > (int)B.charAt(i)) {
                    System.out.println("Yes");
                    enteredLoop = true;
                    break;
                } else {
                    System.out.println("No");
                    enteredLoop = true;
                    break;
                }
            }
        }
        if (A.length() < B.length() && !enteredLoop) {
            System.out.println("No");
        }
        else if (A.length() > B.length() && !enteredLoop) {
            System.out.println("Yes");
        }

        System.out.println(a + " " + b);
        /* Enter your code here. Print output to STDOUT. */

    }
}



