package bai4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_fan;

public class Fan {
    final int SLOW=1;
    final int MEDIUM=2;
    final int FAST=3;
    private int speed = SLOW;
    private boolean on = false;
    private  double radius = 5;
    private String color = "blue";
    public Fan(){

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        if (this.on !=false){
            return "fan is on,"+" \nSpeed: "+speed+" \nColor: "+color+" \nRadius: "+radius;
        }
        else {
            return "fan is off,"+" \nColor: "+color+" \nRadius: "+radius;
        }
    }
}
