/**
 * Created by User on 04.03.2017.
 */
public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private double averageMark;

    public Student(String firstName, String lastName, int age, double averageMark){
    this.age = age;
    this.averageMark = averageMark;
    this.firstName = firstName;
    this.lastName = lastName;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getFullName(){
        return firstName + " " + lastName;
    }
}
