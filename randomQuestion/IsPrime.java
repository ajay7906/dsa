package randomQuestion;

public class IsPrime {
    public static boolean isPrime(int n) {
        // Handle edge cases
        if (n <= 1)
            return false; // Numbers less than or equal to 1 are not prime
        if (n <= 3)
            return true; // 2 and 3 are prime numbers
        if (n % 2 == 0 || n % 3 == 0)
            return false; // Exclude multiples of 2 and 3

        // Check divisors from 5 to sqrt(n)
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }

        return true; // If no divisor found, it's prime
    }

    public static void main(String[] args) {
        int num = 29; // Example input
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

}
