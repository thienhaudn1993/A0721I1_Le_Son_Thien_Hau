package bai5_static_access_modifier.bai_tap.access_modifier;

public class Circle {
    private double radius=1;
    private String color = "red";
    Circle(){};
    Circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.PI*radius*radius;
    }
}
