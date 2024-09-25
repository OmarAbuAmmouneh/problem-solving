import java.util.ArrayList;
import java.util.List;

public class SubstringWithConcatenationOfAllWords {

    public static List<Integer> findSubstring(String s, String[] words) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        String conWords = String.join("", words);
        int wordLength = conWords.length();
        String str = conWords + conWords;

        for (int i = wordLength; i < s.length(); i++) {
            int startIndex = i - wordLength;
            String sub = s.substring(startIndex, i);
            if (str.contains(sub)) {
                list.add(startIndex);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] s = new String[]{"bar","foo","the"};
        findSubstring("barfoofoobarthefoobarman",s);
    }
}
