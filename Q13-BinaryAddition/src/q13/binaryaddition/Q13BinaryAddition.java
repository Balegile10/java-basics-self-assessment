
package q13.binaryaddition;

public class Q13BinaryAddition {

    public static void main(String[] args) {
        String binary1 = "10";
        String binary2 = "11";

        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);
        int sum = num1 + num2;

        System.out.println("Sum of two binary numbers: " + Integer.toBinaryString(sum));
    }
    
}
