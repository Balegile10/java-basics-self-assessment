
package q43.numbercomparisonlogic;

public class Q43NumberComparisonLogic {

    public static void main(String[] args) {
        int first = 2;
        int second = 9;
        int third = 14;

        System.out.println("Input the first number : " + first);
        System.out.println("Input the second number: " + second);
        System.out.println("Input the third number : " + third);

        boolean result = (second > first && third > second);
        System.out.println("The result is: " + result);
    }
    
}
