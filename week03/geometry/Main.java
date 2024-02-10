package week03.geometry;

public class Main {
    public static void main(String[] args) {
       
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);
        System.out.println("Distance between p1 and p2: " + p1.distance(p2));


        Segment segment = new Segment(p1, p2);
        System.out.println("Length of the segment: " + segment.length());
        System.out.println("Slope of the segment: " + segment.getSlope());
        System.out.println("Intercept of the segment: " + segment.getIntercept());
    }
}
