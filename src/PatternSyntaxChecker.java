//https://www.hackerrank.com/challenges/pattern-syntax-checker/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
import java.util.Scanner;
import java.util.regex.*;

public class PatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String pattern = in.nextLine();
            //Write your code
            try {
                testCases--;
                //  Block of code to try
                Pattern.compile(pattern);
                System.out.println("Valid");

            }
            catch(Exception e) {
                //  Block of code to handle errors
                System.out.println("Invalid");

            }
        }
    }
}




