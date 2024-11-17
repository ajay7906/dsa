package randomQuestion;


public class CountDigits {
    public static int countDigits(int num) {
        // Handle the edge case for zero
        if (num == 0) return 1;
        // Use the logarithmic formula
        return (int) Math.floor(Math.log10(Math.abs(num))) + 1;
    }

    public static void main(String[] args) {
        int num = 987654321; // Example input
        System.out.println("Number of digits in " + num + " is: " + countDigits(num));
    }
}
