
package q27.reversestring;

public class Q27ReverseString {

    public static void main(String[] args) {
        String str = "The quick brown fox";
        String reversed = new StringBuilder(str).reverse().toString();

        System.out.println("Reverse string: " + reversed);
    }
    
}
