//https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true
import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        //If not same length just return false
        //I used string builder to use the deleteCharAt() method
        StringBuilder firstString  = new StringBuilder();
        StringBuilder secondString  = new StringBuilder();
        firstString.append(a.toLowerCase());
        secondString.append(b.toLowerCase());
        if (firstString.length() != secondString.length()) {
            return false;
        }
        for (int i = 0; i <= firstString.length(); i++) {
            i = 0;
            String j = Character.toString(firstString.charAt(i));
            int charIndex = secondString.indexOf(j);
            if (charIndex != -1) {
                firstString = new StringBuilder(firstString.substring(i + 1));
                secondString = secondString.deleteCharAt(charIndex);
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
