
package p2.pkg11.removeelement;

import java.util.Arrays;

public class P211RemoveElement {

    public static void main(String[] args) {
        int[] original = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int removeIndex = 1; // Remove element at index 1 (value 14)

        System.out.println("Original Array: " + Arrays.toString(original));

        for (int i = removeIndex; i < original.length - 1; i++) {
            original[i] = original[i + 1];
        }

        // Output array elements up to length - 1
        System.out.print("After removing element: [");
        for (int i = 0; i < original.length - 1; i++) {
            System.out.print(original[i] + (i < original.length - 2 ? ", " : ""));
        }
        System.out.println("]");
    }
    
}
