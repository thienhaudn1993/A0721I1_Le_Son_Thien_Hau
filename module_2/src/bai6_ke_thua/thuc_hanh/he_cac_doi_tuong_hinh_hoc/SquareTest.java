package bai6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);
        square = new Square();
        /*square.setSide(6.4);
        System.out.println(square.);*/
    }
}
