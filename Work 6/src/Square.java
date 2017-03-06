/**
 * Created by evl.a.a on 01.03.2017.
 */
public class Square extends Figure {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(double a) {
        side = a;
    }

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public double getSquare() {
        return side * side;
    }

    @Override
    public void printOnSkrin() {
        System.out.println("Площадь квадрата : " + String.format("%.2f", getSquare()) + " Диагональ квадрата :  " + String.format("%.2f", getDiagonal()));
    }

    public double getDiagonal() {
        return Math.sqrt(2) * side;
    }
}
