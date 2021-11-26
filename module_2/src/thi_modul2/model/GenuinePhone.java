package thi_modul2.model;

public class GenuinePhone extends Phone {
    private String warrantyTime;
    private String warrantyArea;

    public GenuinePhone() {
    }

    public GenuinePhone(int id, String name, double price, int quantity, String brand, String warrantyTime, String warrantyArea) {
        super(id, name, price, quantity, brand);
        this.warrantyTime = warrantyTime;
        this.warrantyArea = warrantyArea;
    }

    public String getWarrantyTime() {
        return warrantyTime;
    }

    public void setWarrantyTime(String warrantyTime) {
        this.warrantyTime = warrantyTime;
    }

    public String getWarrantyArea() {
        return warrantyArea;
    }

    public void setWarrantyArea(String warrantyArea) {
        this.warrantyArea = warrantyArea;
    }

    @Override
    public String toString() {
        return getId()+","+getName()+","+getPrice()+","+getQuantity()+","+getBrand()+","+getWarrantyTime()+","+getWarrantyArea();
    }
    public String genuinePhoneInf(){
        return  "id=" + getId() +
                ", name='" + getName() + "\'" +
                ", price=" + getPrice() +"\'" +
                ", quantity='" + getQuantity() + "\'" +
                ", brand=" + getBrand() + "\'" +
                ", warrantyTime='" + getWarrantyTime() +  "\'" +
                ", warrantyArea='" + getWarrantyArea() +  "\'" +
                '}';
    }

}
