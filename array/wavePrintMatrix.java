public class wavePrintMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        wavePrint(matrix);
    }
    public static void wavePrint(int[][] matrix) {
        for(int col = 0; col < matrix[0].length; col++) {
            if (col % 2 == 0) {
                // Print downwards
                for (int row = 0; row < matrix.length; row++) {
                    System.out.print(matrix[row][col] + " ");
                }
            } else {
                // Print upwards
                for (int row = matrix.length - 1; row >= 0; row--) {
                    System.out.print(matrix[row][col] + " ");
                }
            }
        }
    }
}
