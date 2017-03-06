import static java.lang.Math.pow;
import static java.lang.StrictMath.sqrt;

/**
 * Created by User on 04.03.2017.
 */
public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void printPoint() {
        System.out.println("***Точка***");
        System.out.println("Координаты точки А :");
        System.out.println("Координата X: " + x + " Координата Y: " + y);
    }

    public double getDistance(Point a) {
        return sqrt(pow(x - a.x, 2) + pow(y - a.y, 2));
    }

    public double getDis() {
        Point a = new Point(0, 0);
        return getDistance(a);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
