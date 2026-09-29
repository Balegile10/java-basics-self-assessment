
package p2.pkg05.findindex;

public class P205FindIndex {

    public static void main(String[] args) {
       int[] numbers = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int target = 25;
        int index = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
                break;
            }
        }

        System.out.println("Index position of " + target + " is: " + index);
    }
    
}
