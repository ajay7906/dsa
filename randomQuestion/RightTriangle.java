           
//             *
//            **
//           ***
//          ****
//         *****
//        ******
//       
// 
// 
// 
// 
// 


package randomQuestion;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scn.nextInt();
        //GENERATE THE PATTERN
        for (int i = 1; i <=n; i++){
           //print spaces
           for(int j = 1; j <= n-i; j++){
               System.out.print(" ");
           }
           //print stars
           for(int j = 1; j <= i; j++)
           {
               System.out.print("*");
           }

           System.out.println();
        }
    }
}
