package word_search__0079;

public class Solution {
    int N, M;

    public boolean exist(char[][] board, String word) {
        N = board.length;
        M = board[0].length;

        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < M; ++j) {
                if (dfs(board, i, j, 0, word)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(char[][] board, int i, int j, int k, String word) {
        if (k == word.length()) {
            return true;
        }
        if (i < 0 || i >= N || j < 0 || j >= M || board[i][j] != word.charAt(k)) {
            return false;
        }

        char t = board[i][j];
        board[i][j] = '#';
        if (dfs(board, i + 1, j, k + 1, word) || dfs(board, i - 1, j, k + 1, word) ||
                dfs(board, i, j + 1, k + 1, word) || dfs(board, i, j - 1, k + 1, word)) {
            return true;
        }
        board[i][j] = t;
        return false;
    }
}
