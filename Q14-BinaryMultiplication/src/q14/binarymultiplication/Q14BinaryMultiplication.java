
package q14.binarymultiplication;

public class Q14BinaryMultiplication {

    public static void main(String[] args) {
        String binary1 = "10";
        String binary2 = "11";

        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);
        int product = num1 * num2;

        System.out.println("Product of two binary numbers: " + Integer.toBinaryString(product));
    }

    
    
}
