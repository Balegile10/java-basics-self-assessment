
package p2.pkg09.findduplicates;

public class P209FindDuplicates {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 5, 5, 6, 6, 7, 2};

        System.out.println("Duplicate elements in given array:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[j]);
                }
            }
        }
    }
    
}
