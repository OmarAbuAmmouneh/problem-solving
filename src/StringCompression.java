public class StringCompression {

    public static String compressString (String s) {
        StringBuilder compressedString = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i ++) {
            count++;
            if (i + 1 >= s.length() || s.charAt(i) != s.charAt(i+1)) {
                compressedString.append(s.charAt(i));
                compressedString.append(count);
                count = 0;
            }
        }
        return compressedString.length() < s.length() ? compressedString.toString() : s;

    }

    public static void main(String[] args) {
        String strOne = "hhhhhheeeeeellw";
        System.out.println(compressString(strOne));
    }
}

