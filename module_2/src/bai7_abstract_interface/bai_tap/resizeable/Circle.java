package bai7_abstract_interface.bai_tap.resizeable;

public class Circle extends Sharp implements Resizeable {
    private double radius=1.0;
    public Circle(){

    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius,String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with" +
                "radius=" + getRadius() +
                ", which is a subclass of " + super.toString();

    }

    @Override
    public void resize(double percent) {
        //radius = radius + radius*percent/100
        this.radius += this.radius*percent/100;
    }
}
