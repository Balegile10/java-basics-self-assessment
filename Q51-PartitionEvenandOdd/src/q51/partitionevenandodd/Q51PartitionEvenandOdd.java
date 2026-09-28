
package q51.partitionevenandodd;

import java.util.Arrays;

public class Q51PartitionEvenandOdd {

    public static void main(String[] args) {
        int[] array = {7, 2, 4, 1, 3, 5, 6, 8, 2, 10};

        System.out.println("Original array: " + Arrays.toString(array));

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            while (array[left] % 2 == 0 && left < right) left++;
            while (array[right] % 2 != 0 && left < right) right--;

            if (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }

        System.out.println("After partition the said array becomes: " + Arrays.toString(array));
    }
    
}
