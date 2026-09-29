
package p2.pkg14.checkarraysequals;

import java.util.Arrays;

public class P214CheckArraysEquals {

    public static void main(String[] args) {
        int[] array1 = {2, 5, 7, 9, 11};
        int[] array2 = {2, 5, 7, 9, 11};

        boolean equal = Arrays.equals(array1, array2);

        System.out.println("Are both arrays equal? " + equal);
    }
    
}
