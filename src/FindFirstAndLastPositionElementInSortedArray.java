public class FindFirstAndLastPositionElementInSortedArray {
        public static int[] searchRange(int[] nums, int target) {
            int n = nums.length;
            int start = 0;
            int end = n;
            int[] result = {-1, -1};

            while (start <= end) {
                int mid = (start + end) / 2;

                if (nums[mid] == target) {
                    int rIndex = mid;
                    int lIndex = mid;
                    while (rIndex + 1 < n && target == nums[rIndex + 1]) {
                        rIndex++;
                    }

                    while (lIndex - 1 >= 0 && target == nums[lIndex - 1]) {
                        lIndex--;
                    }
                    result[0] = lIndex;
                    result[1] = rIndex;
                    return result;
                } else if (target > nums[mid]) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            }
            return result;
        }
        public static void main (String args[]) {
            int[] arr = {2, 2};
            searchRange(arr, 2);
        }
}
