public class InterleavingString {
    public static boolean isInterleave(String s1, String s2, String s3) {
        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s2);

        for (int i = 0; i < s3.length(); i++) {
            String c = String.valueOf(s3.charAt(i));
            int i1 = sb1.indexOf(c);
            int i2 = sb2.indexOf(c);
            if (sb1.length() > 0 && i1 != -1) {
                sb1 = sb1.deleteCharAt(i1);
            }
            else if (sb2.length() > 0 &&  i2 != -1) {
                sb2 = sb2.deleteCharAt(i2);
            } else {
                return false;
            }
        }

        return sb1.length() == 0 && sb2.length() == 0;
    }
    public static void main(String args[]) {
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbbaccc";
        boolean val = isInterleave(s1, s2, s3);
        System.out.println(val);
    }
}
