package bai7_abstract_interface.bai_tap.colorable;

public class Main {
    public static void main(String[] args) {
    Shape[] shapes = new Shape[5];
    shapes[0]=new Circle(10);
    shapes[1]=new Rectangle(10,12);
    shapes[2]=new Square(15);
    shapes[3]=new Circle(30);
    shapes[4]=new Rectangle(6,9);
    for (int i=0;i<shapes.length;i++){
        System.out.println("Shape: "+(i+1));
        if (shapes[i] instanceof Circle) {
           Circle circle = (Circle)shapes[i];
            System.out.println("Area Circle = "+circle.getArea());
        }
        else if (shapes[i] instanceof Square){
            Square square =(Square)shapes[i];
            System.out.println("Area Square = "+square.getArea());
            square.howToColor();
        }
        else {
            Rectangle rectangle =(Rectangle)shapes[i];
            System.out.println("Area Rectanage = "+rectangle.getArea());
        }
    }
    }
}
