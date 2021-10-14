package bai6_ke_thua.bai_tap.lop_point_va_moveablepoint;

import java.util.Arrays;

public class TestMoveablePoint {
    public static void main(String[] args) {
       /* MovablePoint movablePoint = new MovablePoint();
        movablePoint.setSpeed(5,8);
        System.out.println(movablePoint);*/
        MovablePoint movablePoint1 = new MovablePoint(2,5,7,12);
        System.out.println(movablePoint1);
//        System.out.println("Array= "+ Arrays.toString(movablePoint1.getSpeed()));
        //sai
        System.out.println("Gọi phương thức move()");
        movablePoint1.move();
        System.out.println(movablePoint1);
    }
}
