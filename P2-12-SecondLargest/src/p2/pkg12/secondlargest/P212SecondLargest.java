
package p2.pkg12.secondlargest;

public class P212SecondLargest {

    public static void main(String[] args) {
        int[] numbers = {10789, 2035, 1899, 1456, 2013};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("Second largest value is: " + secondLargest);
    }
    
}
