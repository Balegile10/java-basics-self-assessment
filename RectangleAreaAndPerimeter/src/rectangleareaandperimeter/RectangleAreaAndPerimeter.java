
package rectangleareaandperimeter;

public class RectangleAreaAndPerimeter {

    public static void main(String[] args) {
        // Given dimensions
        double length = 5.6;
        double width = 8.5;

        // Calculate area and perimeter
        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.printf("Area is %.1f * %.1f = %.2f%n", length, width, area);
        System.out.printf("Perimeter is 2 * (%.1f + %.1f) = %.2f%n", length, width, perimeter);
    }
    
}
