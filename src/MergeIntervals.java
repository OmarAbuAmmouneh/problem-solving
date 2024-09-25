//https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        ArrayList<int[]> result = new ArrayList<>();
        sortArray(intervals);
        int n = intervals.length;

        for (int i = 0; i < n; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            while (i + 1 < n && intervals[i + 1][0] <= end) {
                i++;
                start = Math.min(start, intervals[i][0]);
                end = Math.max(end, intervals[i][1]);
            }

            result.add(new int[]{start, end});
        }
        return result.toArray(new int[result.size()][]);


    }

    public static void sortArray(int[][] nums) {
        Arrays.sort(nums, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            } else {
                return Integer.compare(a[1], b[1]);
            }
        });
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] arr1 = {{1, 4}, {0, 4}};
        int[][] arr2 = {{10, 16}, {2,8}, {1, 6}, {7, 12}};
        merge(arr);
    }
}
