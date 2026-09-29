
package p2.pkg10.sortarrays;

import java.util.Arrays;

public class P210SortArrays {

    public static void main(String[] args) {
        int[] numericArray = {1789, 2035, 1899, 1456, 2013};
        String[] stringArray = {"Java", "Python", "PHP", "C#", "C Program"};

        System.out.println("Original numeric array: " + Arrays.toString(numericArray));
        Arrays.sort(numericArray);
        System.out.println("Sorted numeric array:   " + Arrays.toString(numericArray));

        System.out.println("\nOriginal string array: " + Arrays.toString(stringArray));
        Arrays.sort(stringArray);
        System.out.println("Sorted string array:   " + Arrays.toString(stringArray));
    
    }
    
}
