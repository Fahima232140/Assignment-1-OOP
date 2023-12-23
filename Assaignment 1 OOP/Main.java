
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();
        // Add points here using the Point class constructor

        // Example:
        points.add(new Point(1, 2));
        points.add(new Point(3, 5));
        // Add the rest of the points...

        double perimeter = Shape.perimeter(points);
        double longestSide = Shape.longestSide(points);
        double averageSide = Shape.averageSide(points);

        System.out.printf("Perimeter: %.2f%n", perimeter);
        System.out.printf("Longest Side: %.2f%n", longestSide);
        System.out.printf("Average Side: %.2f%n", averageSide);
    }
}


