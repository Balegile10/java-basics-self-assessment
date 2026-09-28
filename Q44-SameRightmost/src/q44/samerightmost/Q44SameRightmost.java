package q44.samerightmost;

public class Q44SameRightmost {

    public static void main(String[] args) {
        int first = 23;
        int second = 45;
        int third = 13;

        System.out.println("Input the first number : " + first);
        System.out.println("Input the second number: " + second);
        System.out.println("Input the third number : " + third);

        boolean result = (first % 10 == second % 10) || 
                         (first % 10 == third % 10) || 
                         (second % 10 == third % 10);

        System.out.println("The result is: " + result);
    }
    
}
