package bai5_static_access_modifier.thuc_hanh.static_method;

public class TestStaticMethod {
    public static void main(String[] args) {
    Student.change();
        //creating objects
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");
        s1.display();
        s2.display();
        s3.display();
    }
}