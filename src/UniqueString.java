public class UniqueString {
    public static String sortString (String s) {
        char[] c = s.toCharArray();
        java.util.Arrays.sort(c);
        return new String(c);
    }
    public static void checkPermutation (String s1, String s2) {
        System.out.println(sortString(s1).equals(sortString(s2)));
    }

    public static void main(String[] args) {
        String strOne = "hello";
        String strTwo = "elloh";
        checkPermutation(strOne, strTwo);
    }
}
