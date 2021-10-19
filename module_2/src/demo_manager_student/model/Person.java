package demo_manager_student.model;

public class Person {
    protected String name;
    protected int age;
    protected int id;
    protected String address;
    public Person(){

    }
    public Person(String name, int age, int id, String address) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", address='" + address + '\'' +
                '}';
    }
}
