
package q36.formatteddateandtime;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q36FormattedDateAndTime {

    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        Date date = new Date();

        System.out.println("Now: " + formatter.format(date));
    }
    
}
