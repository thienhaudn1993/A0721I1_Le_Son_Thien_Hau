package bai7_abstract_interface.demo_bai_hoc.demo_abstract;

public class Bird extends Animal implements EnableFly,Climb {
    @Override
    public void goToBy() {

    }

    @Override
    public void fly() {
        System.out.println("Chim bay bang canh");
    }

    @Override
    public void climb() {
        System.out.println("Chim co the treo cay");
    }
}
