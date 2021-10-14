package bai6_ke_thua.bai_tap.lop_point2d_va_lop_point3d;

import java.util.Arrays;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2.5f,4.5f);
        System.out.println(point2D.getX());
        System.out.println(point2D.getY());
        System.out.println("array= "+Arrays.toString(point2D.getXY()));
        System.out.println(point2D);
    }
}
