public class StringRotation {

    private static boolean isRotation (String str1, String str2) {
        String str3 = str1.concat(str1);
        if (str3.contains(str2)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String firstString = "hello";
        String secondString = "elloh";
        boolean b = isRotation(firstString, secondString);
        System.out.println(b);
    }

}
