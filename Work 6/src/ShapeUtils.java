/**
 * Created by User on 02.03.2017.
 */
public class ShapeUtils extends Rectangle {
    private double a;
    private double h;

    public ShapeUtils(double a, double h) {
        super(a, h);
    }

    @Override
    public boolean rectangleTrues() {
        if (a != h) {
        }
        return true;
    }
}
