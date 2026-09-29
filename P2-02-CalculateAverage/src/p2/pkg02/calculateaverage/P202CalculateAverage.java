
package p2.pkg02.calculateaverage;

public class P202CalculateAverage {

    public static void main(String[] args) {
        int[] numbers = {20, 30, 25, 35, -16, 60, -100};
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        double average = (double) sum / numbers.length;
        System.out.println("Average value of array elements is: " + average);
    }
    
}
