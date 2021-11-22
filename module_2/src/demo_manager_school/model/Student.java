package demo_manager_school.model;

import java.util.Objects;

public class Student extends People {
    private double point;
    private String subject;

    public Student() {
    }

    public Student(int id, String name, int age, String address, double point, String subject) {
        super(id, name, age, address);
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
        return getId()+","+getName()+","+getAge()+","+getAddress()+","+getPoint()+","+getSubject();
    }

    public String studentInf(){
        return "id=" + getId() +
                ", name='" + getName() + "\'" +
                ", age=" + getAge() +"\'" +
                ", address='" + getAddress() + "\'" +
                ", point=" + point + "\'" +
                ", subject='" + subject +  "\'" +
                '}';
    }


}
