package bai6_ke_thua.demo_bai_hoc;

public class Teacher  extends Employee{


    public Teacher(double salary) {
        super(salary);
    }

    public Teacher(int id, String name, String address, double salary) {
        super(id, name, address, salary);
    }
    public void teach(){

        System.out.println("có thể dạy học");
    }
    @Override
    public void goToBy(){
        System.out.println(" Teacher đi lại bằng xe đạp");
    }

}
