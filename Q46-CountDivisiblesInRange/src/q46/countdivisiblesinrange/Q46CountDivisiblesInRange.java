
package q46.countdivisiblesinrange;

public class Q46CountDivisiblesInRange {

    public static void main(String[] args) {
        int rangeStart = 1;
        int rangeEnd = 20;
        int divisor = 4;
        int count = 0;

        for (int i = rangeStart; i <= rangeEnd; i++) {
            if (i % divisor == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
    
}
