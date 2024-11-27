package randomQuestion;

import java.util.Scanner;

public class InvertedStarPattern {
    public static void main(String[] args){
        Scanner scn  =  new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scn.nextInt();
         
        //generate the pattern
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print(" X");
            }
            System.out.println();
        }
    }
}
