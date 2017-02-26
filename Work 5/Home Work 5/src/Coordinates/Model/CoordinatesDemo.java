package Coordinates.Model;

/**
 * Created by Lino on 25.02.2017.
 */
public class CoordinatesDemo {
    public static void main(String[] args) {

        Point pointOne = new Point(3, 4);
        Rectangle rectangle = new Rectangle(3, 4, 5, 7);
        Point pointZero = new Point(0, 0);

        pointOne.printPoint();
        System.out.println("Растояние от точки начала координат до точки А : " +
                String.format("%.2f", pointZero.getDistance(pointOne)));

        rectangle.printRectangle();

    }
}
