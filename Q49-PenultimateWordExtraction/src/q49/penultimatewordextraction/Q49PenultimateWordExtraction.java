
package q49.penultimatewordextraction;

public class Q49PenultimateWordExtraction {

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog.";

        System.out.println("Input a String: " + sentence);

        // Remove trailing punctuation like period if present
        String cleaned = sentence.replaceAll("[^a-zA-Z0-9 ]", "");
        String[] words = cleaned.split("\\s+");

        if (words.length >= 2) {
            System.out.println("Penultimate word: " + words[words.length - 2]);
        }
    }
    
}
