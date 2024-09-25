import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class LetterCombinationsOfAPhoneNumber {
    List<String> result = new ArrayList<>();
    HashMap<Character, String> map = new HashMap<>();

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return result;
        }

        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        StringBuilder sb = new StringBuilder();
        backTrack(sb, 0, digits);
        return result;
    }

    private void backTrack(StringBuilder sb, int i, String digits) {
        if (sb.length() == digits.length()) {
            result.add(sb.toString());
            return;
        }

        String letters = map.get(digits.charAt(i));

        for (char c: letters.toCharArray()) {
            sb.append(c);
            backTrack(sb, i + 1, digits);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
        LetterCombinationsOfAPhoneNumber solution = new LetterCombinationsOfAPhoneNumber();
        String digits = "23"; // Input digits to test
        List<String> combinations = solution.letterCombinations(digits);

        System.out.println("Letter combinations for " + digits + ": " + combinations);
    }
}
