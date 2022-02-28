package com.codegym.model;

import java.util.Date;

public class HealthDeclaration {
    private String fullName;
    private Date birthday;
    private String gender;
    private String country;
    private String nationalId;
    private String vehicle;
    private String vehicleId;
    private int numberSeat;
    private String dateStart;
    private String dateEnd;
    private String note;
    private String city;
    private String district;
    private String ward;
    private String address;
    private String phone;
    private String email;
    private Symptom symptom;
    private History history;

    public HealthDeclaration() {
    }

    public HealthDeclaration(String fullName, Date birthday, String gender, String country, String nationalId, String vehicle, String vehicleId, int numberSeat, String dateStart, String dateEnd, String note, String city, String district, String ward, String address, String phone, String email, Symptom symptom, History history) {
        this.fullName = fullName;
        this.birthday = birthday;
        this.gender = gender;
        this.country = country;
        this.nationalId = nationalId;
        this.vehicle = vehicle;
        this.vehicleId = vehicleId;
        this.numberSeat = numberSeat;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.note = note;
        this.city = city;
        this.district = district;
        this.ward = ward;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.symptom = symptom;
        this.history = history;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getNumberSeat() {
        return numberSeat;
    }

    public void setNumberSeat(int numberSeat) {
        this.numberSeat = numberSeat;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Symptom getSymptom() {
        return symptom;
    }

    public void setSymptom(Symptom symptom) {
        this.symptom = symptom;
    }

    public History getHistory() {
        return history;
    }

    public void setHistory(History history) {
        this.history = history;
    }
}
