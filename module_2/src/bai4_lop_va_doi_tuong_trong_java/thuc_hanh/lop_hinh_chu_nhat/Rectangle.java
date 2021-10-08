package bai4_lop_va_doi_tuong_trong_java.thuc_hanh.lop_hinh_chu_nhat;

public class Rectangle {
    double width;
    double height;
    public Rectangle(){
    }
    public Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return 2*(this.width+this.height);
    }
    public String display(){
        return "Rectangle{" + "width=" + this.width + ", height=" + this.height + "}";
    }
}
