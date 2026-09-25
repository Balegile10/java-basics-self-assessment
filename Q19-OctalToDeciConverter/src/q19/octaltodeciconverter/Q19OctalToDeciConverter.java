
package q19.octaltodeciconverter;

public class Q19OctalToDeciConverter {

    public static void main(String[] args) {
        String octal = "10";
        int decimal = Integer.parseInt(octal, 8);
        System.out.println("Equivalent decimal number: " + decimal);
    }
    
}
