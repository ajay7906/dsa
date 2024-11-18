package randomQuestion;

import java.util.Scanner;

public class KRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number and k
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        System.out.print("Enter the value of k (rotation count): ");
        int k = scanner.nextInt();

        // Perform K-Rotation
        System.out.println("Number after k-rotation: " + rotateNumber(n, k));
    }

    public static int rotateNumber(int n, int k) {
        // Convert the number to a string to count digits
        String numStr = Integer.toString(n);
        int numDigits = numStr.length();

        // Normalize k (handle both positive and negative rotations)
        k = k % numDigits;
        if (k < 0) {
            k += numDigits; // Convert negative rotation to equivalent positive
        }

        // Perform the rotation
        String rotated = numStr.substring(numDigits - k) + numStr.substring(0, numDigits - k);
        return Integer.parseInt(rotated);
    }
}
