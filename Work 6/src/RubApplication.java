/**
 * Created by evl.a.a on 01.03.2017.
 */
public class RubApplication {
    public static void main(String[] args) {

        Point point = new Point( 4, 5);
        point.printPoint();

        Figure circle = new Circle(10);
        circle.printOnSkrin();

        Figure triangle = new Triangle(6, 8);
        triangle.printOnSkrin();

        Figure ellipse = new Ellipse(7, 9);
        ellipse.printOnSkrin();

        Figure square = new Square(6);
        square.printOnSkrin();

        Figure rectangle = new Rectangle(9, 4);
        rectangle.printOnSkrin();

        System.out.println("Большая площадь фигуры : " + Math.max(rectangle.getSquare(), triangle.getSquare()));
    }
}
