
package q6_formulacomputation;


public class Q6_FormulaComputation {

   
    public static void main(String[] args) {
        // Given values
        double principal = 5000;
        double rate = 7.5;
        double time = 3;

        // Formula: SI = (P * R * T) / 100
        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple Interest: " + simpleInterest);
    }
    
}
