/**
 * Created by User on 02.03.2017.
 */
public class Rectangle extends Figure {
    private double base;
    private double height;

    public boolean rectangleTrues() {
        if (base != height) {
        }
        return true;
    }

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

    public Rectangle(double a, double h) {
        this.base = a;
        this.height = h;

    }

    public double getDiagonal() {
        return Math.sqrt((Math.pow(base, 2)) + Math.pow(height, 2));
    }

    @Override
    public void printOnSkrin() {
        System.out.println("Площадь прямоугольника : " + String.format("%.2f", getSquare()) + " Диагональ прямоугольника :  " + String.format("%.2f", getDiagonal()) + " Являеться ли фигура прямоугольником ? " + rectangleTrues());

    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public double getSquare() {
        return base * height;
    }
}
