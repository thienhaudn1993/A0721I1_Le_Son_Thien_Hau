package bai_tap_lam_them.model;

public class Vehicle {
    private String bienKiemSoat;
    private String hangXe;
    private int namSanXuat;
    private String chuSoHuu;

    public Vehicle() {
    }

    public Vehicle(String bienKiemSoat, String hangXe, int namSanXuat, String chuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.hangXe = hangXe;
        this.namSanXuat = namSanXuat;
        this.chuSoHuu = chuSoHuu;
    }

    public String getHangXe() {
        return hangXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "bienKiemSoat='" + bienKiemSoat + '\'' +
                ", hangXe='" + hangXe + '\'' +
                ", namSanXuat='" + namSanXuat + '\'' +
                ", chuSoHuu='" + chuSoHuu + '\'' +
                '}';
    }
}
