package demo_manager_student.model;

import java.util.Objects;

public class Student extends Person implements Comparable<Student>{
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
        return " id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", subject='" + subject + '\'' +
                ", point=" + point +
                '}';
    }

   /* @Override
    public boolean equals(Object o) {
        return ((Student)o).getName().equals(this.getName());
    }

    @Override
    public int hashCode() {
        return 12;
    }*/
 @Override
    public int compareTo(Student o) {
//        if (this.getName().compareTo(o.getName())==0){
//            return this.getAge()-o.getAge();
//        }
        return this.getName().compareTo(o.getName());
    }
    public String getInfoToCSV(){
     return this.name+","+ this.age+","+this.id+","+this.address+","+this.point+","+this.subject;
    }
}
