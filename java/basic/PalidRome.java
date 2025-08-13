import java.util.Scanner;
class public PalidRome{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int num = scn.nextInt();

        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }

        scn.close(); // good practice to close the Scanner

    }
}

public static isPalindrome(int number) {
    int original = number;
    int reversed = 0;
   
    while (number > 0) {
        int digit = number % 10;
        reversed = reversed * 10 + digit;
        number = number / 10;
    }

    return original == reversed;
}