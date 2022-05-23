package thimodulebackend.thimodulebackend.model;

import javax.persistence.*;

@Entity
@Table(name = "hospital")
public class BenhAn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ma_benh_an;
    private String ma_benh_nhan;
    private String ten_bn;
    private String ngay_nv;
    private String ngay_rv;
    private String ly_do_nv;
    private String phuong_phap;
    private String bac_si_dieu_tri;

    public BenhAn() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMa_benh_an() {
        return ma_benh_an;
    }

    public void setMa_benh_an(String ma_benh_an) {
        this.ma_benh_an = ma_benh_an;
    }

    public String getMa_benh_nhan() {
        return ma_benh_nhan;
    }

    public void setMa_benh_nhan(String ma_benh_nhan) {
        this.ma_benh_nhan = ma_benh_nhan;
    }

    public String getTen_bn() {
        return ten_bn;
    }

    public void setTen_bn(String ten_bn) {
        this.ten_bn = ten_bn;
    }

    public String getNgay_nv() {
        return ngay_nv;
    }

    public void setNgay_nv(String ngay_nv) {
        this.ngay_nv = ngay_nv;
    }

    public String getNgay_rv() {
        return ngay_rv;
    }

    public void setNgay_rv(String ngay_rv) {
        this.ngay_rv = ngay_rv;
    }

    public String getLy_do_nv() {
        return ly_do_nv;
    }

    public void setLy_do_nv(String ly_do_nv) {
        this.ly_do_nv = ly_do_nv;
    }

    public String getPhuong_phap() {
        return phuong_phap;
    }

    public void setPhuong_phap(String phuong_phap) {
        this.phuong_phap = phuong_phap;
    }

    public String getBac_si_dieu_tri() {
        return bac_si_dieu_tri;
    }

    public void setBac_si_dieu_tri(String bac_si_dieu_tri) {
        this.bac_si_dieu_tri = bac_si_dieu_tri;
    }
}
