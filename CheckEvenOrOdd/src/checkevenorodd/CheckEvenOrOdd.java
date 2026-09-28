
package checkevenorodd;

public class CheckEvenOrOdd {

    public static void main(String[] args) {
        int number = 20;

        System.out.println("Input a number: " + number);
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
    
}
