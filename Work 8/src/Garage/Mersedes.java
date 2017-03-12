package Garage;

/**
 * Created by Lino on 11.03.2017.
 */
public class Mersedes extends Car{

    private String mark;
    private String model;
    private int year;
    private String type;
    private String clas;
    private int mileage;

    public Mersedes(String model, int year, int mileage) {
        this.mark = "Merсedes";
        this.model = model;
        this.year = year;
        this.type = "Car";
        this.clas = "A";
        this.mileage = mileage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Mersedes mersedes = (Mersedes) o;

        if (year != mersedes.year) return false;
        if (mileage != mersedes.mileage) return false;
        if (mark != null ? !mark.equals(mersedes.mark) : mersedes.mark != null) return false;
        if (model != null ? !model.equals(mersedes.model) : mersedes.model != null) return false;
        if (type != null ? !type.equals(mersedes.type) : mersedes.type != null) return false;
        return clas != null ? clas.equals(mersedes.clas) : mersedes.clas == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (mark != null ? mark.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + year;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (clas != null ? clas.hashCode() : 0);
        result = 31 * result + mileage;
        return result;
    }

    @Override
    public String toString() {
        return "\nМарка '" + mark + '\'' +
                ", Модель '" + model + '\'' +
                ", Год выпуска " + year +
                ", Тип '" + type + '\'' +
                ", Класс '" + clas + '\'' +
                ", Пробег " + mileage +" км."
                + ", Номер авто ";
    }

    @Override
    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void setClas(String clas) {
        this.clas = clas;
    }

    @Override
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String getMark() {
        return mark;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getClas() {
        return clas;
    }

    @Override
    public int getMileage() {
        return mileage;
    }
}
