
package q55.righttrianglecheck;

import java.util.Arrays;

public class Q55RightTriangleCheck {

    public static void main(String[] args) {
        int a = 6, b = 9, c = 12;

        System.out.println("Input three integers(sides of a triangle)");
        System.out.println(a + " " + b + " " + c);

        int[] sides = {a, b, c};
        Arrays.sort(sides);

        System.out.println("If the given sides form a right triangle?");
        if (Math.pow(sides[0], 2) + Math.pow(sides[1], 2) == Math.pow(sides[2], 2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    
}
