import static java.lang.Math.sqrt;


public class Program {

    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(10, 10);
        System.out.println("Расстояние между точками (" + p1.toString() + ") и (" + p2.toString() + ") = " + distance(p1, p2));
        System.out.println(p1.distance(p2));
    }

    public static double distance(Point p1, Point p2) {
        return sqrt((p2.getX() - p1.getX()) * (p2.getX() - p1.getX()) + (p2.getY() - p1.getY()) * (p2.getY() - p1.getY()));
    }

}
