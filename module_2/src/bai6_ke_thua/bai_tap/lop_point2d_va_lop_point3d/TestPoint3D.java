package bai6_ke_thua.bai_tap.lop_point2d_va_lop_point3d;

import java.util.Arrays;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(2,3,4);
        System.out.println(point3D);
        point3D.setZ(5);
        System.out.println(point3D);
        point3D.setXYZ(4,5,6);
        System.out.println(point3D);
        System.out.println("array = "+ Arrays.toString(point3D.getXYZ()));
    }
}
