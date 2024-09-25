public class OneAway {
    public static boolean didReplaceChar (String str1, String str2) {
          if (str1.length() != str2.length()) return false;
          for (int i = 0; i < str1.length(); i++) {
              if (str1.charAt(i) != str2.charAt(i)) return false;
          }
          return true;
    }
    public static boolean didInsertOrRemoveChar (String str1, String str2) {
        int lengthBetweenStrings = str1.length() - str2.length();
        if (Math.abs(lengthBetweenStrings) > 1) return false;
        int count = 1;
        String shorterString = lengthBetweenStrings > 0 ? str2 : str1;
        String longerString = lengthBetweenStrings > 0 ? str1 : str2;
        for (int i = 0; i < shorterString.length(); i++) {
            if (shorterString.charAt(i) != longerString.charAt(i)) count++;
        }
        return count < 2;
    }

    public static void main(String[] args) {
        String strOne = "hellow";
        String strTwo = "hello";
        boolean checkOne = didReplaceChar(strOne, strTwo);
        boolean checkTwo = didInsertOrRemoveChar(strOne, strTwo);
        if (!checkOne && !checkTwo) {
            System.out.println("Not one away");
        } else {
            System.out.println("One away!");
        }
    }

}
