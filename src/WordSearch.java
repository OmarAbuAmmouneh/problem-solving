public class WordSearch {
    static boolean found = false;

    public static boolean wordSearch(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                boolean[][] visited = new boolean[m][n];
                dfs(board, i, j, visited, word, 0);
                if (found) return true;
            }
        }
        return found;
    }

    private static void dfs(char[][] board, int i, int j, boolean[][] visited, String word, int index) {
        int m = board.length;
        int n = board[0].length;

        if (found) {
            return;
        }

        if (i < 0 || j < 0 || i >= m || j >= n || visited[i][j] || board[i][j] != word.charAt(index)) {
            return;
        }

        if (index == word.length() - 1) {
            found = true;
            return;
        }

        visited[i][j] = true;

        // Right
        dfs(board, i, j + 1, visited, word, index + 1);
        // Top
        dfs(board, i - 1, j, visited, word, index + 1);
        // Bottom
        dfs(board, i + 1, j, visited, word, index + 1);
        // Left
        dfs(board, i, j - 1, visited, word, index + 1);

        visited[i][j] = false;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'a', 'a', 'a', 'a'},
                {'a', 'a', 'a', 'a'},
                {'a', 'a', 'a', 'a'}
        };
        System.out.println(wordSearch(board, "aaaaaaaaaaaaa"));  // Test with the word "aaaaaaaaaaaaa"
    }
}
