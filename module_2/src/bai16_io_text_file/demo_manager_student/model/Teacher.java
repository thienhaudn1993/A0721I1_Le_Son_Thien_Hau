package demo_manager_student.model;

public class Teacher extends Person{
    private float salary;
    public Teacher(){

    }
    public Teacher(int id, String name, int age, String address, float salary) {
        super(id, name, age, address);
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
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public void goToBy() {

    }
    public void teach(){
        System.out.println("GV đang dạy");
    }
}
