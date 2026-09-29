
package p2.pkg04containsvalue;

public class P204ContainsValue {

    public static void main(String[] args) {
        int[] numbers = {1789, 2035, 1899, 1456, 2013};
        int target = 2013;
        boolean found = false;

        for (int num : numbers) {
            if (num == target) {
                found = true;
                break;
            }
        }

        System.out.println("Contains " + target + "? " + found);

    }
    
}
