
package q10.americanflagdisplay;

public class Q10AmericanFlagDisplay {

    
    public static void main(String[] args) {
        String p1 = "* * * * * * ===================================";
        String p2 = " * * * * *  ===================================";
        String p3 = "===============================================";

        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                System.out.println(p1);
            } else {
                System.out.println(p2);
            }
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(p3);
        }
    }
    
}
