
package q53.sumdigitstosingledigits;

public class Q53SumDigitsToSingleDigits {

    public static void main(String[] args) {
       int number = 25;

        System.out.println("Input a positive integer: " + number);

        int sum = number;
        while (sum >= 10) {
            int temp = sum;
            sum = 0;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
        }

        System.out.println(sum);
    }
    
}
