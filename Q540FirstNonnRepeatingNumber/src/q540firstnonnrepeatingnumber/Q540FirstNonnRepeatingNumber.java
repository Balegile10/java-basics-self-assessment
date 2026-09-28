
package q540firstnonnrepeatingnumber;

public class Q540FirstNonnRepeatingNumber {

    public static void main(String[] args) {
        String str = "google";
        int index = -1;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                index = i;
                break;
            }
        }

        System.out.println("Index of first non-repeating character in '" + str + "' is: " + index);
    }
    
}
