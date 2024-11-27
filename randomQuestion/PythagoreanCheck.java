package randomQuestion;

import java.util.Arrays;

public class PythagoreanCheck {
    public static boolean isPythagoreanTriple(int a, int b, int c) {
        int[] sides = {a, b, c};
        Arrays.sort(sides);

        return sides[0] * sides[0] + sides[1] * sides[1] == sides[2] * sides[2];
    }

    public static void main(String[] args) {
        int a = 3, b = 4, c = 0;
        System.out.println(isPythagoreanTriple(a, b, c));
    }
}

