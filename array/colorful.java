public class colorful {
    public static void main(String[] args) {
        // ANSI escape codes for colors
        String[] colors = {
            "\u001B[31m", // Red
            "\u001B[32m", // Green
            "\u001B[33m", // Yellow
            "\u001B[34m", // Blue
            "\u001B[35m", // Magenta
            "\u001B[36m"  // Cyan
        };

        String reset = "\u001B[0m"; // Reset to default color

        // Print colorful stars
        System.out.println("Colorful Stars:");
        for (int i = 0; i < 10; i++) {
            // Select a random color
            String color = colors[(int) (Math.random() * colors.length)];
            System.out.print(color + "* " + reset); // Print a star with the color
        }

        System.out.println(); // New line at the end
    }
}
