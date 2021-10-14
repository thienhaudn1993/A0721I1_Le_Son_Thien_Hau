package bai6_ke_thua.bai_tap.lop_point_va_moveablepoint;

public class Point {
    private float x =0.0f;
    private float y =0.0f;
    public Point(){

    }
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        float[] arr = {x,y};
        return arr;
    }

    @Override
    public String toString() {
        return "(x,y){" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
