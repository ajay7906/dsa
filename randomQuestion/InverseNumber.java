package randomQuestion;

import java.util.Scanner;

public class InverseNumber {
    public static void main(String[] args) {
        // Input the number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to inverse: ");
        int num = scanner.nextInt();

        // Compute the inverse
        int inverse = findInverse(num);

        // Output the result
        System.out.println("Inverted Number: " + inverse);
    }

    // Function to find the inverse of a number
    public static int findInverse(int num) {
        int position = 1; // Current position in the original number
        int inverse = 0;  // Resulting inverse number

        while (num != 0) {
            int digit = num % 10;  // Extract the last digit
            inverse += position * Math.pow(10, digit - 1); // Place position in the digit's position
            num /= 10;  // Remove the last digit
            position++;  // Move to the next position
        }

        return inverse;
    }
}
