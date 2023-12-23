import java.util.List;

public class Shape {
    public static double perimeter(List<Point> points) {
        double perimeter = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            perimeter += points.get(i).distanceTo(points.get(i + 1));
        }
        perimeter += points.get(points.size() - 1).distanceTo(points.get(0)); // Closing the shape
        return perimeter;
    }

    public static double longestSide(List<Point> points) {
        double longestSide = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            double currentSide = points.get(i).distanceTo(points.get(i + 1));
            if (currentSide > longestSide) {
                longestSide = currentSide;
            }
        }
        double closingSide = points.get(points.size() - 1).distanceTo(points.get(0));
        longestSide = Math.max(longestSide, closingSide); // Check the closing side
        return longestSide;
    }

    public static double averageSide(List<Point> points) {
        double totalDistance = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            totalDistance += points.get(i).distanceTo(points.get(i + 1));
        }
        totalDistance += points.get(points.size() - 1).distanceTo(points.get(0)); // Closing the shape
        return totalDistance / points.size();
    }
}
