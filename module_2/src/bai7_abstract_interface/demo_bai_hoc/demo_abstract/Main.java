package bai7_abstract_interface.demo_bai_hoc.demo_abstract;

public class Main {
    public static void main(String[] args) {
        Panda panda = new Panda();
        panda.goToBy();
        panda.howToEat();
        Bird bird = new Bird();
        bird.fly();
        bird.climb();
        Plane plane = new Plane();
        plane.fly();
        panda.climb();
        Mockey mockey = new Mockey();
        mockey.climb();
    }
}
