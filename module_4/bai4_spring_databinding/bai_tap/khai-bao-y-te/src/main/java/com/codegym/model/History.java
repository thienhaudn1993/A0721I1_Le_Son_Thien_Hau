package com.codegym.model;

public class History {
    private String lichSuDiChuyen;
    private String tiepXucGan;

    public History() {
    }

    public History(String lichSuDiChuyen, String tiepXucGan) {
        this.lichSuDiChuyen = lichSuDiChuyen;
        this.tiepXucGan = tiepXucGan;
    }

    public String getLichSuDiChuyen() {
        return lichSuDiChuyen;
    }

    public void setLichSuDiChuyen(String lichSuDiChuyen) {
        this.lichSuDiChuyen = lichSuDiChuyen;
    }

    public String getTiepXucGan() {
        return tiepXucGan;
    }

    public void setTiepXucGan(String tiepXucGan) {
        this.tiepXucGan = tiepXucGan;
    }
}
