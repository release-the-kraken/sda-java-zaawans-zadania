package website_homework.OOP.Exercise2;

public class Student extends Person {
    String studiesType;
    int year;
    double tuition;

    public Student(String studiesType, int year, double tuition) {
        this.studiesType = studiesType;
        this.year = year;
        this.tuition = tuition;
    }

    public String getStudiesType() {
        return studiesType;
    }

    public void setStudiesType(String studiesType) {
        this.studiesType = studiesType;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getTuition() {
        return tuition;
    }

    public void setTuition(double tuition) {
        this.tuition = tuition;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", studiesType='" + studiesType + '\'' +
                ", year=" + year +
                ", tuition=" + tuition +
                '}';
    }
}
