import java.util.Arrays;

public class FinMinArrowShots {

    public static int findMinArrowShots(int[][] points) {
        int arrows = 1;
        int leftEnd = points[0][1];

        Arrays.sort(points, (a, b) -> {
            if (a[1] != b[1]) {
                return Integer.compare(a[1], b[1]);
            } else {
                return Integer.compare(a[0], b[0]);
            }
        });

        for (int i = 0; i < points.length; i++) {
            int start = points[i][0];
            if(start > leftEnd) {
                arrows++;
                leftEnd = points[i][1];
            }
        }
        return arrows;
    }

    public static void main(String[] args) {
        int[][] intervals = {
                {9, 12},
                {1, 10},
                {4, 11},
                {8, 12},
                {3, 9},
                {6, 9},
                {6, 7}
        };
        int value = findMinArrowShots(intervals);
        System.out.println(value == 2 ? "true": "false");
    }
}
