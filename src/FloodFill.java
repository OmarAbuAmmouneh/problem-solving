import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int value = image[sr][sc];
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        dfs(image, sr, sc, value, map, color);
        return image;
    }

    private static void dfs(int[][] image, int i, int j, int value, HashMap<Integer, List<Integer>> map, int color) {
        int m = image.length;
        int n = image[0].length;
        if (map.containsKey(i)) {
            if (map.get(i).contains(j)) {
                return;
            }
        }
        if (map.containsKey(i)) {
            map.get(i).add(j);
        } else {
            map.put(i, new ArrayList<>(j));
        }
        if (i < 0 || j < 0 || i > m - 1 || j > n - 1 || image[i][j] != value) {
            return;
        }

        image[i][j] = color;

        //Top
        dfs(image, i - 1, j, value, map, color);

        //Right
        dfs(image, i, j + 1, value, map, color);

        //Bottom
        dfs(image, i + 1, j, value, map, color);

        //Left
        dfs(image, i, j - 1, value, map, color);
    }

//    class Solution {
//        public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
//            int originalColor = image[sr][sc];
//            // If the color to be filled is the same as the original, there's nothing to do
//            if (originalColor != newColor) {
//                dfs(image, sr, sc, originalColor, newColor);
//            }
//            return image;
//        }
//
//        private void dfs(int[][] image, int i, int j, int originalColor, int newColor) {
//            int m = image.length;
//            int n = image[0].length;
//
//            // Boundary and condition check
//            if (i < 0 || j < 0 || i >= m || j >= n || image[i][j] != originalColor) {
//                return;
//            }
//
//            // Change the color of the current pixel
//            image[i][j] = newColor;
//
//            // Recursively call DFS for all 4 neighboring pixels
//            dfs(image, i - 1, j, originalColor, newColor); // Top
//            dfs(image, i + 1, j, originalColor, newColor); // Bottom
//            dfs(image, i, j - 1, originalColor, newColor); // Left
//            dfs(image, i, j + 1, originalColor, newColor); // Right
//        }
//    }


    public static void main(String args[]) {
        //[1,1,1],[1,1,0],[1,0,1]
        int[][] arr = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        floodFill(arr, 1, 1, 2);
    }
}