
package p2.pkg15.arraytoarraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class P215ArrayToArrayList {

    public static void main(String[] args) {
        String[] stringArray = {"Python", "JAVA", "PHP", "Perl", "C#", "C++"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(stringArray));

        System.out.println("ArrayList output: " + list);
    }
    
}
