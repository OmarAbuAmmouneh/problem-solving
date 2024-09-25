import java.util.HashMap;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int n = s.length();
        if (n == 1) return true;
        int j = n - 1;
        for (int i = 0; i <= j / 2; i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if (c1 != c2) {
                return false;
            }
            j--;
        }
        return true;
    }

    public static void main (String args[]) {
        boolean value = isPalindrome(1000030001);
        System.out.println(value);
    }
}
