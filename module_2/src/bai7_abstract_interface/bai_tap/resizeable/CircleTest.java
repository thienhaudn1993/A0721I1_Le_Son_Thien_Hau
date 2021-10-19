package bai7_abstract_interface.bai_tap.resizeable;

import java.util.Random;

public class CircleTest {
    public static void main(String[] args) {
        Random random =  new Random();
        Circle[] circles = new Circle[20];
        // init array circle
        int lenght = circles.length;
        for (int i=0;i<lenght;i++){
            circles[i]=new Circle(10);
        }
        //resize
        for (int i=0;i<lenght;i++){
            System.out.println("----------------------------");
            System.out.println("Sharp: "+(i+1));
            System.out.println("Area before resize: "+circles[i].getArea());
            int percent =(int)(random.nextDouble()*100);
            System.out.println("Percent= "+percent+" %");
            circles[i].resize(percent);
            System.out.println("Area after resize: "+circles[i].getArea());
        }


    }
}
