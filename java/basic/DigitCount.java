import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = 0;
        int temp = Math.abs(number); // handle negative numbers

        if (temp == 0) {
            count = 1; // special case for 0
        } else {
            while (temp > 0) {
                temp = temp / 10;
                count++;
            }
        }

        System.out.println("Number of digits: " + count);
    }
}
