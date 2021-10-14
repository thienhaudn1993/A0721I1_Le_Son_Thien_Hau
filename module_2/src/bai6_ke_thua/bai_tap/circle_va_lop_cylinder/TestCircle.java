package bai6_ke_thua.bai_tap.circle_va_lop_cylinder;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        Circle circle1 = new Circle(2.5,"green");
        System.out.println(circle1);
        circle1.setRadius(5.8);
        System.out.println(circle1);
        System.out.println("Area="+ circle1.getArea());

    }
}
