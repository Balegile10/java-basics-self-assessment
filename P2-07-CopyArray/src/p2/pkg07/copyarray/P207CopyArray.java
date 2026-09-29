
package p2.pkg07.copyarray;

import java.util.Arrays;

public class P207CopyArray {

    public static void main(String[] args) {
       int[] original = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int[] copy = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        System.out.println("Source Array: " + Arrays.toString(original));
        System.out.println("New Array:    " + Arrays.toString(copy));
    }
    
}
