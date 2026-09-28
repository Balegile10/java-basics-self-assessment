
package q35.filesizefinder;

import java.io.File;

public class Q35FileSizeFinder {
    public static void main(String[] args) {
        File file1 = new File("/home/students/abc.txt");
        File file2 = new File("/home/students/test.txt");

        System.out.println(file1.getPath() + "  : " + file1.length() + " bytes");
        System.out.println(file2.getPath() + "  : " + file2.length() + " bytes");
    }
    }
