package bai5_static_access_modifier.bai_tap.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(10);
        System.out.println("Radius: "+circle1.getRadius());
        System.out.println("Area: "+circle1.getArea());
    }
}
