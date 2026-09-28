
package q45.secondstotimeconverstion;

public class Q45SecondsToTimeConverstion {

    public static void main(String[] args) {
        int seconds = 86399;

        int p1 = seconds % 60;
        int p2 = seconds / 60;
        int p3 = p2 % 60;
        p2 = p2 / 60;

        System.out.println("Input seconds: " + seconds);
        System.out.printf("%02d:%02d:%02d%n", p2, p3, p1);
        
        
        
        
    }
    
}
