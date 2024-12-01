import java.util.Scanner;

public class barchart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of bars
        System.out.print("Enter the number of bars: ");
        int n = sc.nextInt();

        // Input the heights of the bars
        int[] bars = new int[n];
        System.out.println("Enter the heights of the bars:");
        int max = 0;
        for (int i = 0; i < n; i++) {
            bars[i] = sc.nextInt();
            if (bars[i] > max) {
                max = bars[i]; // Find the maximum height for scaling
            }
        }

        // Draw the bar chart
        System.out.println("\nBar Chart:");
        for (int i = max; i > 0; i--) { // Iterate from top height down to 1
            for (int bar : bars) {
                if (bar >= i) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        // Print the base
        for (int bar : bars) {
            System.out.print("---");
        }
        System.out.println();

        // Print bar labels
        for (int bar : bars) {
            System.out.printf(" %d ", bar);
        }
        System.out.println();

        sc.close();
    }
}
