/**
 * Created by evl.a.a on 01.03.2017.
 */
public class Triangle extends Figure {
    private double base;
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        this.height = h;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double a) {
        this.base = a;
    }

    public Triangle(double a, double h) {
        this.base = a;
        this.height = h;

    }

    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public double getSquare() {
        return base * height / 2;
    }

    @Override
    public void printOnSkrin() {
        System.out.println("Площадь треугольника : " + String.format("%.2f", getSquare()) + " Периметр треугольника :  " + String.format("%.2f", getPerimeter()));
    }

    public double getPerimeter() {
        return (2 + Math.sqrt(2)) * height;
    }
}
