// // traverse the 2d array
// class TwoDArrayTraversal {
//     public static void main(String[] args) {
//         int[][] matrix = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {7, 8, 9}
//         };

//         System.out.println("Row-wise traversal:");
//         printRowWise(matrix);

//         System.out.println("\nColumn-wise traversal:");
//         printColumnWise(matrix);
//     }

//     static void printRowWise(int[][] matrix) {
//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[i].length; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     static void printColumnWise(int[][] matrix) {
//         if (matrix.length == 0) return;
//         int rows = matrix.length;
//         int cols = matrix[0].length;
//         for (int j = 0; j < cols; j++) {
//             for (int i = 0; i < rows; i++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }



class 2dArr {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 4},
            {3, 4, 5},
            {6, 7, 8}
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
   
}