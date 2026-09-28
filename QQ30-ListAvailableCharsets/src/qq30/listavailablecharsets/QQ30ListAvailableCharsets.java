
package qq30.listavailablecharsets;
import java.nio.charset.Charset;

public class QQ30ListAvailableCharsets {

    public static void main(String[] args) {
        System.out.println("List of available character sets:");
        for (String str : Charset.availableCharsets().keySet()) {
            System.out.println(str);
        }
    }
    
}
