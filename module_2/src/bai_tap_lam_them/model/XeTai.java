package bai_tap_lam_them.model;

public class XeTai extends Vehicle{
    private double trongTai;

    public XeTai() {
    }

    public XeTai(String bienKiemSoat, String hangXe, int namSanXuat, String chuSoHuu, double trongTai) {
        super(bienKiemSoat, hangXe, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return getBienKiemSoat()+","+getHangXe()+","+getNamSanXuat()+","+getChuSoHuu()+","+getTrongTai();
    }
}
