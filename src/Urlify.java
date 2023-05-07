public class Urlify {
    public static String replaceWhiteSpace (String s) {
        String t = s.replaceAll(" ", "%20");
        return t;
    }

    public static void main(String[] args) {
        String strOne = "he ll o";
        System.out.println(replaceWhiteSpace(strOne));
    }
}
