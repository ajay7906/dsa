import java.util.*;
public class vertical{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of bars: ");
        int n = scn.nextInt();

        int[] bars = new int[n];

        //Input the height of th bars
        System.out.println("Enter the heights of the bars:");
        int maxHeight = 0;
        for (int i = 0; i < n; i++) {
            bars[i] = scn.nextInt();
            maxHeight = Math.max(maxHeight, bars[i]);
        }

        //Draw the bar chart  
        System.out.println("\nBar Chart:");
        for (int i = maxHeight; i > 0; i--) {
            for (int j = 0; j < n; j++) {
                if (bars[j] >= i) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();   
        }  
         // Print the base of the bars
         for (int j = 0; j < n; j++) {
            System.out.print("---");
        }
        System.out.println();

        // Print bar heights below the chart
        for (int bar : bars) {
            System.out.printf(" %d ", bar);
        }
        System.out.println();
    }

}