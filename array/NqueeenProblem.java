public class NqueeenProblem {
    // do this problem using backtracking
    public static void main(String[] args) {
        int n = 4;
        int[][] board = new int[n][n];
        if (solveNQueens(board, 0)) {
            printBoard(board);
        } else {
            System.out.println("No solution exists");
        }
    }
    public static boolean solveNQueens(int[][] board, int col) {
        if (col >= board.length) {
            return true;
        }
        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, i, col)) {
                board[i][col] = 1;
                if (solveNQueens(board, col + 1)) {
                    return true;
                }
                board[i][col] = 0; // backtrack
            }
        }
        return false;
    }
}
