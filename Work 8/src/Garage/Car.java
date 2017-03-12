package Garage;

/**
 * Created by Lino on 10.03.2017.
 */
public abstract class Car {
    private String mark;
    private String model;
    private int year;
    private String type;
    private String clas;
    private int mileage;

    public int hashCode () {
        final int prime = 31;
        int result = 1;
        result = prime * mileage + year;
        return result;
    }

    public String toString () {
        return getClas() + clas + getMark() + mark + getModel() + model + getYear() + year;
    }


    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getMileage() {

        return mileage;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getType() {
        return type;
    }

    public String getClas() {
        return clas;
    }
}
