
package q7_circleareaandperimeter;

public class Q7_CircleAreaAndPerimeter {

    public static void main(String[] args) {
        // Given radius
        double radius = 7.5;

        // Calculate perimeter and area using Math.PI
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
        
    }
    
}
