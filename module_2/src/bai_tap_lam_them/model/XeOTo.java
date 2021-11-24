package bai_tap_lam_them.model;

public class XeOTo extends Vehicle {
    private int soChoNgoi;
    private String kieuXe;

    public XeOTo() {
    }

    public XeOTo(String bienKiemSoat, String hangXe, int namSanXuat, String chuSoHuu, int soChoNgoi, String kieuXe) {
        super(bienKiemSoat, hangXe, namSanXuat, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return getBienKiemSoat()+","+getHangXe()+","+getNamSanXuat()+","+getChuSoHuu()+","+getSoChoNgoi()+","+getKieuXe();
    }
}
