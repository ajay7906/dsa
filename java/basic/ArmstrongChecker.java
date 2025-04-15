import java.util.Scanner;

public class ArmstrongChecker {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int num = scn.nextInt();

        if (isArmStrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }

        scn.close(); // good practice to close the Scanner
    }

    static boolean isArmStrong(int number) {
        int original = number;
        int result = 0;

        while (number > 0) {
            int digit = number % 10;
            result += (int) Math.pow(digit, 3); // cast to int
            number = number / 10;
        }

        return result == original;
    }
}
