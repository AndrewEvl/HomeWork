package Coordinates.Model;

/**
 * Created by Lino on 25.02.2017.
 */
public class Rectangle {
    private double leftX;
    private double leftY;
    private double rightsX;
    private double rightsY;
    private double area;

    public Rectangle(double a, double b, double c, double d) {
        this.leftX = a;
        this.leftY = b;
        this.rightsX = c;
        this.rightsY = d;
    }

    public void printRectangle() {
        System.out.println("***Прямоугольник***");
        System.out.println("Координаты точки А :");
        System.out.println("Координата X: " + leftX + " Координата Y: " + leftY);
        System.out.println("Координаты точки B :");
        System.out.println("Координата X: " + rightsX + " Координата Y: " + rightsY);
        System.out.println("Площадь прямоугольника : " + areaRectangle());
        System.out.println("Диагональ прямоугольника : " +
                String.format("%.2f", diagonal()));
    }

    private double diagonal() {
        return Math.sqrt(Math.pow(rightsX - leftX, 2) + Math.pow(rightsY - leftY, 2));
    }

    private double areaRectangle() {
        return (rightsX - leftX) * (rightsY - leftY);
    }

    public double getLeftX() {
        return leftX;
    }

    public double getLeftY() {
        return leftY;
    }

    public double getRightsX() {
        return rightsX;
    }

    public double getRightsY() {
        return rightsY;
    }

    public void setLeftX(double leftX) {
        this.leftX = leftX;
    }

    public void setLeftY(double leftY) {
        this.leftY = leftY;
    }

    public void setRightsX(double rightsX) {
        this.rightsX = rightsX;
    }

    public void setRightsY(double rightsY) {
        this.rightsY = rightsY;
    }
}
