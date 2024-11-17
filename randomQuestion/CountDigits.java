package randomQuestion;
public class CountDigits {
    public static int countDigits(int num) {
        int count = 0;
        // Handle negative numbers
        num = Math.abs(num);

        do {
            count++;
            num /= 10;
        } while (num != 0);

        return count;
    }

    public static void main(String[] args) {
        int num = 12345; // Example input
        System.out.println("Number of digits in " + num + " is: " + countDigits(num));
    }
}
