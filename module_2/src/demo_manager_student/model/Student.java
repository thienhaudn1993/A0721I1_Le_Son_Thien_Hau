package demo_manager_student.model;

public class Student extends Person {
    private double point;
    private String subject;

    public Student() {
    }

    public Student(String name, int age, int id, String address, double point, String subject) {
        super(name, age, id, address);
        this.point = point;
        this.subject = subject;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", subject='" + subject + '\'' +
                ", point=" + point +
                '}';
    }
}
