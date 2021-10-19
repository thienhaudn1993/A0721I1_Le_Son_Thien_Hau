package bai7_abstract_interface.demo_bai_hoc.demo_abstract;

public class Mockey extends Animal implements Climb {
    @Override
    public void goToBy() {
        System.out.println("4 chan");
    }

    @Override
    public void climb() {
        System.out.println("Mockey treo cay");
    }
}
