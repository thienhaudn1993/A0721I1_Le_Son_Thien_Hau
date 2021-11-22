package bai_tap_lam_them.model;

public class xeMay extends Vehicle {
    private double congSuat;

    public xeMay() {
    }

    public xeMay(double congSuat) {
        this.congSuat = congSuat;
    }

    public xeMay(String bienKiemSoat, String hangXe, int namSanXuat, String chuSoHuu, double congSuat) {
        super(bienKiemSoat, hangXe, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "xeMay{" +
                "congSuat=" + congSuat +
                '}';
    }
}
