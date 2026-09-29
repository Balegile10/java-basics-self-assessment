
package p2.pkg01.sumarrayvalues;

public class P201SumArrayValues {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        System.out.println("The sum is: " + sum);
    }
    
}
