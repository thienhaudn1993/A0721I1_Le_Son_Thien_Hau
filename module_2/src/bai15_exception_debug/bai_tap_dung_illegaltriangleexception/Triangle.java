package bai15_exception_debug.bai_tap_dung_illegaltriangleexception;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) throws IllegalTriangleException {
        if (a<=0 || b<=0 || c<=0) {
            throw new IllegalTriangleException("Vui lòng nhập cạnh >0");
        }
        if (a+b<c || a+c<b || b+c<a) {
            throw new IllegalTriangleException("Vui lòng nhập cạnh sao cho tổng 2 cạnh phải lớn hơn cạnh còn lại");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
