
package q48.capitalizeandlowercase;

public class Q48CapitalizeAndLowercase {

    public static void main(String[] args) {
        String sentence = "the quick brown fox jumps over the lazy dog.";

        System.out.println("Input a Sentence: " + sentence);

        String[] words = sentence.split(" ");
        StringBuilder capitalized = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                capitalized.append(Character.toUpperCase(word.charAt(0)))
                           .append(word.substring(1))
                           .append(" ");
            }
        }

        System.out.println("Capitalized: " + capitalized.toString().trim());
        System.out.println("Lowercase:   " + sentence.toLowerCase());
    }
    
}
