/**
 * Created by evl.a.a on 01.03.2017.
 */
public class Circle extends Figure {
    private double radius;

    public double getRadius() {
        return radius;
    }

    @Override
    public void printOnSkrin() {
        System.out.println("Площадь круга : " + String.format("%.2f", getSquare()) + " Длинна окружности :  " + String.format("%.2f", getLength()));
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double r) {
        radius = r;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public double getSquare() {
        return Math.PI * radius * radius;
    }

    public double getLength() {
        return 2 * Math.PI * radius;
    }
}