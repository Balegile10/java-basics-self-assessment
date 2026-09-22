
package q01_powerandsquareroot;

public class Q01_PowerAndSquareRoot {

    
    public static void main(String[] args) {
        // Given values
        double base = 2;
        double exponent = 10;
        double number = 81;

        // Calculations
        double powerResult = Math.pow(base, exponent);
        double sqrtResult = Math.sqrt(number);

        // Output matching required sample
        System.out.println((int) base + " ^ " + (int) exponent + " = " + powerResult);
        System.out.println("Square root of " + (int) number + " = " + sqrtResult);
    }
    }
    
}
