import java.util.HashSet;

public class Search2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int start = 0;
        int end = n;
        int curr = m / 2;
        // Check if it is not in the array
        int smallestNum = matrix[0][0];
        int largestNum = matrix[m - 1][n - 1];
        HashSet<Integer> visited = new HashSet<>();
        if (target < smallestNum || target > largestNum) {
            return false;
        }

        while (start < end) {
            if (target < matrix[curr][0]) {
                if (visited.contains(curr)) {
                    return false;
                }
                visited.add(curr);
                curr--;
                continue;
            }
            if (target > matrix[curr][n - 1]) {
                if (visited.contains(curr)) {
                    return false;
                }
                visited.add(curr);
                curr++;
                continue;
            }

            int mid = (start + end) / 2;

            if (target == matrix[curr][mid]) {
                return true;
            } else if (target > matrix[curr][mid]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return false;
    }

    public static void  main (String args[]) {
        int[][] arr = {{1}, {3}};
        System.out.println(searchMatrix(arr, 2));
    }
}
