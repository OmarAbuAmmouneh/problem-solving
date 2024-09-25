import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CombinationSum {
    static List<List<Integer>> result = new ArrayList<>();

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        backTrack(candidates, list, target, 0);
        return result;
    }

    private static void backTrack(int[] nums, List<Integer> list, int target, int sum) {
        if (sum == target) {
            result.add(new ArrayList<>(list));
            return;
        }
        if (sum > target) {
            return;
        }

        for (int num : nums) {
            sum += num;
            list.add(num);
            backTrack(nums, list, target, sum);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7};
        List<List<Integer>> r = combinationSum(arr, 7);
    }
}
