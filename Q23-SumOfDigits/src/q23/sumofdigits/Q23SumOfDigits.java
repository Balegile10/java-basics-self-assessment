
package q23.sumofdigits;

public class Q23SumOfDigits {

    public static void main(String[] args) {
       int number = 700;
        int temp = number;
        int sum = 0;

        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("The sum of the digits is: " + sum);
    }
    
}
