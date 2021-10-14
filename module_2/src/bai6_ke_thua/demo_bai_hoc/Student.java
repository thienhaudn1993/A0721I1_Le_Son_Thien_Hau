package bai6_ke_thua.demo_bai_hoc;

public class Student extends Person {
    String subject;


    public Student(String subject) {
        this.subject = subject;
    }
    public Student() {
    }

    public Student(int id,String name, String address){
        super(id,name,address);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    public void study(){
        System.out.println("đang hoc môn " + this.subject);
    }
    // overloading
    public void registerSubject(){
        System.out.println("đã đăng ký môn học ");
    }
    // overloading
    public void registerSubject(String subject){
        System.out.println("đănng ký môn học: " +subject);
    }
    // overriding phương thức của cha
    @Override
    public void goToBy() {
        System.out.println("Đi lại bằng xe máy ");
    }
    // overriding phương thức của cha
    @Override
    public String toString() {
        return "Sinh vien{ id =" +this.id+"- name: "+ this.name+ "- address: "+ this.address+ "- subject: "+ this.subject+"}";
    }
}
