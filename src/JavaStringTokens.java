//https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
import java.util.*;
public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] tokens = s.split("[^a-zA-Z]");
        int tokensLength = 0;

        for (int i=0; i<tokens.length; i++)
            //To check for white space
            if (tokens[i].length() > 0) {
                tokensLength++;
            }

        System.out.println(tokensLength);

        for (int i=0; i<tokens.length; i++)
            //To check for white space
            if (tokens[i].length() > 0) {
                System.out.println(tokens[i]);
            }
        scan.close();
    }
}



