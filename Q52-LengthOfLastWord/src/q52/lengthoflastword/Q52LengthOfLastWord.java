
package q52.lengthoflastword;

public class Q52LengthOfLastWord {

    public static void main(String[] args) {
       String str = "The length of last word";

        System.out.println("Original String: " + str);

        String[] words = str.trim().split("\\s+");
        int length = words[words.length - 1].length();

        System.out.println("Length of the last word of the above string: " + length);
    }
    
}
