/**
 * Created by evl.a.a on 01.03.2017.
 */
public class Ellipse extends Figure {
    private double oneCircle;
    private double twoCircle;

    public Ellipse(double a, double b) {
        super(a, b);
        oneCircle = 2 * Math.PI * a;
        twoCircle = 2 * Math.PI * b;
    }

    @Override
    public String getName() {
        return "Ellipse";
    }

    @Override
    public double getSquare() {
        return Math.PI * oneCircle * twoCircle;
    }

    @Override
    public void printOnSkrin() {
        System.out.println("Площадь элипса : " + String.format("%.2f", getSquare()) + " Сумма длин окружностей :  " + String.format("%.2f", getAxisSum()));
    }

    public double getAxisSum() {
        return oneCircle + twoCircle;
    }
}