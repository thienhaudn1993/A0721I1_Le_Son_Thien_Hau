package bai7_abstract_interface.bai_tap.resizeable;

import java.util.Random;

public class SquareTest {
    public static void main(String[] args) {
        Random random =  new Random();
        Square[] squares = new Square[20];
        // init array square
        int lenght = squares.length;
        for (int i=0;i<lenght;i++){
            squares[i]=new Square(10);
        }
        //resize
        for (int i=0;i<lenght;i++){
            System.out.println("----------------------------");
            System.out.println("Sharp: "+(i+1));
            System.out.println("Area before resize: "+squares[i].getArea());
            int percent =(int)(random.nextDouble()*100);
            System.out.println("Percent= "+percent+" %");
            squares[i].resize(percent);
            System.out.println("Area after resize: "+squares[i].getArea());
        }
    }
}
