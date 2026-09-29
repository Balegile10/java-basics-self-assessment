
package p2.pkg08.countevenodd;

public class P208CountEvenOdd {

    public static void main(String[] args) {
        int[] numbers = {5, 7, 2, 4, 9, 10, 12, 11};
        int evenCount = 0;
        int oddCount = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd elements : " + oddCount);
    }
    
}
