package model;

public class DevisionEmployee {
    private int devision_id;
    private String devision_name;

    public DevisionEmployee() {
    }

    public DevisionEmployee(int devision_id, String devision_name) {
        this.devision_id = devision_id;
        this.devision_name = devision_name;
    }

    public int getDevision_id() {
        return devision_id;
    }

    public void setDevision_id(int devision_id) {
        this.devision_id = devision_id;
    }

    public String getDevision_name() {
        return devision_name;
    }

    public void setDevision_name(String devision_name) {
        this.devision_name = devision_name;
    }
}
