//https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InsertInterval {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] arr = addElement(intervals, newInterval);

        ArrayList<int[]> result = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int start = arr[i][0];
            int end = arr[i][1];

            while (i + 1 < n && arr[i + 1][0] <= end) {
                i++;
                start = Math.min(start, arr[i][0]);
                end = Math.max(end, arr[i][1]);
            }


            result.add(new int[] {start, end});
        }
        return result.toArray(new int[result.size()][]);
    }

    public void sortArray(int[][] arr) {
        Arrays.sort(arr, (a,b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            } else {
                return Integer.compare(a[1], b[1]);
            }
        });
    }

    public static int[][] addElement(int[][] arr, int[] newElement) {
        ArrayList<int[]> list = new ArrayList<>();

        boolean isAdded = false;
        if (arr.length == 0 || (arr.length == 1 && arr[0].length == 0)) {
            // Handle the empty array case
            list.add(newElement);
        } else {
            for (int i = 0; i < arr.length; i++) {
                int start = newElement[0];
                int end = newElement[1];
                if (arr[i][0] > start && !isAdded) {
                    list.add(newElement);
                    list.add(arr[i]);
                    isAdded = true;
                } else if (arr[i][0] == start && !isAdded) {
                    if (arr[i][1] >= end) {
                        list.add(newElement);
                        list.add(arr[i]);
                    } else {
                        list.add(arr[i]);
                        list.add(newElement);
                    }
                    isAdded = true;
                }
                else {
                    list.add(arr[i]);
                }
        }}
        if (!isAdded) {
            list.add(newElement);
        }
        return list.toArray(new int[list.size()][]);
    }

    public static void main(String[] args) {
        int[][] arr = {{2,5}, {6,7}, {8,9}};
        int[] newInterval = {0,1};
        insert(arr, newInterval);
    }
}
