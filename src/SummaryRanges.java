import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    public static List<String> summaryRanges(int[] nums) {
        ArrayList<String> result = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];

            while (i + 1 < n && nums[i + 1] == nums[i] + 1) {
                i++;
            }
            if (start != nums[i]) {
                result.add(start + "->" + nums[i]);
            }
            else {
                result.add(String.valueOf(start));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};
        summaryRanges(nums);
    }
}
