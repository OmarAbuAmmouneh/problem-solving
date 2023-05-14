import java.util.Arrays;

public class RotateMatrix {

    public static boolean RotateMatrix90Degree(int[][] matrix) {
        if (matrix.length == 0) return false;
        for (int layer = 0; layer < matrix.length/2; layer++) {
            int first = layer;
            int last = matrix.length - 1 - layer;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i];
                //left-top
                matrix[first][i] = matrix[last][last - offset];
                //bottom-left
                matrix[last][last - offset] = matrix[last - offset][last];
                //right-bottom
                matrix[last - offset][last] = matrix[i][last];
                matrix[i][last] = top;
            }
        }
        return true;
    }

    public static void PrintMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        RotateMatrix90Degree(matrix);
        PrintMatrix(matrix);
    }
}

