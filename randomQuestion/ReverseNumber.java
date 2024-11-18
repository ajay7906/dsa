package randomQuestion;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // Input the number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to reverse: ");
        int num = scanner.nextInt();

        // Call the reverse function
        int reversed = reverseNumber(num);

        // Output the reversed number
        System.out.println("Reversed Number: " + reversed);
    }

    // Function to reverse the number
    public static int reverseNumber(int num) {
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;  // Extract the last digit
            reversed = reversed * 10 + digit;  // Append it to reversed number
            num /= 10;  // Remove the last digit
        }

        return reversed;
    }
}
