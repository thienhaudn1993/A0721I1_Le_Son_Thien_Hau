package com.codegym.model;

public class Symptom {
    private String sot;
    private String ho;
    private String khoTho;
    private String dauHong;
    private String non;
    private String tieuChay;
    private String xuatHuyetNgoaiDa;
    private String noiBanNgoaiDa;

    public Symptom() {
    }

    public Symptom(String sot, String ho, String khoTho, String dauHong, String non, String tieuChay, String xuatHuyetNgoaiDa, String noiBanNgoaiDa) {
        this.sot = sot;
        this.ho = ho;
        this.khoTho = khoTho;
        this.dauHong = dauHong;
        this.non = non;
        this.tieuChay = tieuChay;
        this.xuatHuyetNgoaiDa = xuatHuyetNgoaiDa;
        this.noiBanNgoaiDa = noiBanNgoaiDa;
    }

    public String getSot() {
        return sot;
    }

    public void setSot(String sot) {
        this.sot = sot;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getKhoTho() {
        return khoTho;
    }

    public void setKhoTho(String khoTho) {
        this.khoTho = khoTho;
    }

    public String getDauHong() {
        return dauHong;
    }

    public void setDauHong(String dauHong) {
        this.dauHong = dauHong;
    }

    public String getNon() {
        return non;
    }

    public void setNon(String non) {
        this.non = non;
    }

    public String getTieuChay() {
        return tieuChay;
    }

    public void setTieuChay(String tieuChay) {
        this.tieuChay = tieuChay;
    }

    public String getXuatHuyetNgoaiDa() {
        return xuatHuyetNgoaiDa;
    }

    public void setXuatHuyetNgoaiDa(String xuatHuyetNgoaiDa) {
        this.xuatHuyetNgoaiDa = xuatHuyetNgoaiDa;
    }

    public String getNoiBanNgoaiDa() {
        return noiBanNgoaiDa;
    }

    public void setNoiBanNgoaiDa(String noiBanNgoaiDa) {
        this.noiBanNgoaiDa = noiBanNgoaiDa;
    }
}
