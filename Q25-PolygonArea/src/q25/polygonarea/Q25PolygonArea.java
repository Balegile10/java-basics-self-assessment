
package q25.polygonarea;

public class Q25PolygonArea {

    public static void main(String[] args) {
        int n = 7;
        double s = 6;
        double area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));

        System.out.println("The area is: " + area);
    }
    
}
