public class ZeroMatrix {
    private static void setZeros (int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }
        for (int i = 0; i < row.length; i++) {
            //nullify row
            if (row[i]) {
                nullifyRow(matrix, i);
            }
        }

        for (int j = 0; j < column.length; j++) {
            //nullify column
            if (row[j]) {
                nullifyColumn(matrix, j);
            }
        }
    }
    private static void nullifyRow (int[][] matrix, int row) {
        for (int j = 0; j < matrix[0].length; j++) {
            matrix[row][j] = 0;
        }
    }
    private static void nullifyColumn (int[][] matrix, int column) {
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[i][column] = 0;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 0, 9}};
        setZeros(matrix);
        RotateMatrix.PrintMatrix(matrix);
    }
}
