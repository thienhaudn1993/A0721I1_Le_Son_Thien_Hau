package bai5_static_access_modifier.demo1;

public class Student {
    private int id; // biến instance/global
    protected String name;
    protected String address;
    static String school="HN"; //biến static
    static String school1="HN";

    static {
        school ="CodeGym";
        System.out.println("đây là khối static");
    }

    public Student() {

    }

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        Student.school = school;
    }
    /*public Student(int id, String name, String address, String school) {
        this.id = id;
        // tham số name là biến local
        this.name = name;
        this.address = address;
        this.school = school;
    }*/
    // pt static
    public static void registerSubject(){
        String subject="toán";// biến local
        System.out.println("đang môn học "+subject);
        // để truy cập vào pt thường thì cần phải khởi tạo đối tượng
        Student student = new Student(2,"hau","DN");
        student.login();
    }
    // pt thường
    public  void login(){
        System.out.println("login "+name);
    }
}
