package bai_tap_lam_them.model;

public class XeMay extends Vehicle {
    private double congSuat;

    public XeMay() {
    }

    public XeMay(double congSuat) {
        this.congSuat = congSuat;
    }

    public XeMay(String bienKiemSoat, String hangXe, int namSanXuat, String chuSoHuu, double congSuat) {
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
        return getBienKiemSoat()+","+getHangXe()+","+getNamSanXuat()+","+getChuSoHuu()+","+getCongSuat();
    }
}
