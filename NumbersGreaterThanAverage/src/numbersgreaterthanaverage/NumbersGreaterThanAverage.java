//Question 50
package numbersgreaterthanaverage;

import java.util.Arrays;


public class NumbersGreaterThanAverage {

    public static void main(String[] args) {
       int[] array = {1, 4, 17, 7, 25, 3, 100};

        System.out.println("Original Array: " + Arrays.toString(array));

        double sum = 0;
        for (int num : array) {
            sum += num;
        }

        double average = sum / array.length;
        System.out.println("The average of the said array is: " + average);

        System.out.println("The numbers in the said array that are greater than the average are:");
        for (int num : array) {
            if (num > average) {
                System.out.println(num);
            }
        }
    }
    
}
