public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void distance(Point otherPoint) {
        double dystans = Math.sqrt((otherPoint.x - x)*(otherPoint.x - x) + (otherPoint.y - y)*(otherPoint.y - y));
        System.out.printf("Dystans: %f%n", dystans);
    }
}
