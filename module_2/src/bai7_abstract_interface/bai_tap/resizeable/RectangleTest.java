package bai7_abstract_interface.bai_tap.resizeable;

import java.util.Random;

public class RectangleTest {
    public static void main(String[] args) {
        Random random =  new Random();
        Rectangle[] rectangles = new Rectangle[20];
        // init array rectange
        int lenght = rectangles.length;
        for (int i=0;i<lenght;i++){
            rectangles[i]=new Rectangle(10,15);
        }
        //resize
        for (int i=0;i<lenght;i++){
            System.out.println("----------------------------");
            System.out.println("Sharp: "+(i+1));
            System.out.println("Area before resize: "+rectangles[i].getArea());
            int percent =(int)(random.nextDouble()*100);
            System.out.println("Percent= "+percent+" %");
            rectangles[i].resize(percent);
            System.out.println("Area after resize: "+rectangles[i].getArea());
        }
    }
}
