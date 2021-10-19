package bai7_abstract_interface.demo_bai_hoc.demo_abstract;

public class Panda extends DongVatAnCo implements Climb {
    @Override
    public void howToEat() {
        System.out.println("Panda eat");
    }

    @Override
    public void goToBy() {
        System.out.println("Di chuyen bang cach bo");
    }

    @Override
    public void climb() {
        System.out.println("Panda Treo cay");
    }
}
