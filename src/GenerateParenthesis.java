import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    static List<String> result = new ArrayList<>();

    public static List<String> generateParenthesis(int n) {

        backTrack("", 0, 0, n);
        return result;
    }

    private static void backTrack(String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        if (open < max) {
            backTrack(current + "(", open + 1, close, max);
        }

        if (close < open) {
            backTrack(current + ")", open, close + 1, max);
        }
    }

    public static void main(String[] args) {
        generateParenthesis(2);
    }
}
