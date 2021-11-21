package demo_manager_school.model;

public class Teacher extends People  {
    private String salary;

    public Teacher() {
    }

    public Teacher(int id, String name, int age, String address, String salary) {
        super(id, name, age, address);
        this.salary = salary;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return getId()+","+getName()+","+getAge()+","+getAddress()+","+getSalary();
    }

    public String teacherInf(){
        return "id=" + getId() +
                ", name='" + getName() + "\'" +
                ", age=" + getAge() +"\'" +
                ", address='" + getAddress() + "\'" +
                ", salary=" + getSalary() + "\'" +
                '}';
    }
}
