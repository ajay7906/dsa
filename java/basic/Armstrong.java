import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int num = scn.nextInt(); // Fixed scanner variable

        // Compute the cube using Math.pow and cast the result to int
        int result = (int) Math.pow(num, 3); // Fixed type issue
        System.out.println("The cube of " + num + " is: " + result);
    }
}
