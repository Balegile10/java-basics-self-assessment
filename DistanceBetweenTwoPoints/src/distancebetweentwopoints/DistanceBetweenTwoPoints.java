
package distancebetweentwopoints;

public class DistanceBetweenTwoPoints {

    public static void main(String[] args) {
        // Points: Nashville (36.12, -86.67), Los Angeles (33.94, -118.40)
        double lat1 = Math.toRadians(36.12);
        double lon1 = Math.toRadians(-86.67);
        double lat2 = Math.toRadians(33.94);
        double lon2 = Math.toRadians(-118.40);

        double radius = 6371.01; // Earth's radius in km
        double distance = radius * Math.acos(Math.sin(lat1) * Math.sin(lat2) + 
                          Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));

        System.out.println("The distance between those points is: " + distance + " km");
    }
    
}
