//https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true
import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String s, String t) {
        if (t.length() != s.length()) return false;
        StringBuilder sb = new StringBuilder(t);

        for (int i = 0; i < s.length(); i++) {
            String str = String.valueOf(s.charAt(i));
            int index = sb.indexOf(str);
            if (index != -1) {
                sb.deleteCharAt(index);
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String a = "anagram";
        String b = "nagaram";

        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
