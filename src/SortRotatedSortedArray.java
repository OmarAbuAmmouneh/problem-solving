import java.util.HashSet;

public class SortRotatedSortedArray {

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        while (start < end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            //Search the left subarray
            else if (target < nums[mid] && target >= nums[start]) {
                if (nums[start] == target) return start;
                end = mid;
            }
            //Search in the right subarray
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void  main (String args[]) {
        int[] arr = {3, 1};
        System.out.println(search(arr, 3));
    }
}
