package randomQuestion;

public class GcdLcm {

     // Function to calculate GCD using the Euclidean Algorithm
     public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate LCM using the relationship between GCD and LCM
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b); // Use GCD to calculate LCM
    }

    public static void main(String[] args) {
        int num1 = 36;
        int num2 = 60;

        int gcdResult = gcd(num1, num2);
        int lcmResult = lcm(num1, num2);

        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("GCD: " + gcdResult);
        System.out.println("LCM: " + lcmResult);
    }
    
}
