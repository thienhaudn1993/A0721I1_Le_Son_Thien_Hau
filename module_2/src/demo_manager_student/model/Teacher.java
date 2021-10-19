package demo_manager_student.model;

public class Teacher extends Person {
    private float salary;
    public Teacher(){

    }

    public Teacher(String name, int age, int id, String address, float salary) {
        super(name, age, id, address);
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", address='" + address + '\'' +
                '}';
    }
}
