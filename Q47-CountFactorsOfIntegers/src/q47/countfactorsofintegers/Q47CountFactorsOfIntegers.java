
package q47.countfactorsofintegers;

public class Q47CountFactorsOfIntegers {

    public static void main(String[] args) {
        int number = 25;
        int count = 0;

        System.out.println("Input an integer: " + number);
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
    
}
