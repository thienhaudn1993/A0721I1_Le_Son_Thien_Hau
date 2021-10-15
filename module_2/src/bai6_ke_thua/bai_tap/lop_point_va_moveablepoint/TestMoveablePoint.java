package bai6_ke_thua.bai_tap.lop_point_va_moveablepoint;

public class TestMoveablePoint {
    public static void main(String[] args) {
       /* MovablePoint movablePoint = new MovablePoint();
        movablePoint.setSpeed(5,8);
        System.out.println(movablePoint);*/
        MoveablePoint moveablePoint1 = new MoveablePoint(2,5,7,12);
        System.out.println(moveablePoint1);
//        System.out.println("Array= "+ Arrays.toString(movablePoint1.getSpeed()));
        //sai
        System.out.println("Gọi phương thức move()");
        moveablePoint1.move();
        System.out.println(moveablePoint1);
    }
}
