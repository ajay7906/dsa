package randomQuestion;

import java.util.Scanner;

public class KrotateNumber { public static int rotateNumber(int num, int k) {
    // Find the number of digits in the number
    int digits = (int) Math.log10(num) + 1;

    // Normalize k in case it is larger than the number of digits
    k = k % digits;
    if (k < 0) {
        k += digits; // Handle negative rotations
    }

    // Split the number into two parts
    int divisor = (int) Math.pow(10, k);
    int leftPart = num / divisor;       // First part of the number
    int rightPart = num % divisor;     // Remaining part

    // Adjust the right part to the correct place value
    int multiplier = (int) Math.pow(10, digits - k);
    int rotatedNumber = (rightPart * multiplier) + leftPart;

    return rotatedNumber;
}

public static void main(String[] args) {
    int num = 12345;
    int k = 2;

    System.out.println("Original Number: " + num);
    System.out.println("Rotated Number: " + rotateNumber(num, k));
}
}
