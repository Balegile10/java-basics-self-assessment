
package p2.pkg06.reversearray;

import java.util.Arrays;

public class P206ReverseArray {
    
    public static void main(String[] args) {
        int[] array = {1789, 2035, 1899, 1456, 2013};

        System.out.println("Original array: " + Arrays.toString(array));

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        System.out.println("Reversed array: " + Arrays.toString(array));
    }
    
}
