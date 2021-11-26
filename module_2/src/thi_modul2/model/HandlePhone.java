package thi_modul2.model;

public class HandlePhone extends Phone {
    private String handleCountry;
    private String status;

    public HandlePhone() {
    }

    public HandlePhone(int id, String name, double price, int quantity, String brand, String handleCountry, String status) {
        super(id, name, price, quantity, brand);
        this.handleCountry = handleCountry;
        this.status = status;
    }

    public String getHandleCountry() {
        return handleCountry;
    }

    public void setHandleCountry(String handleCountry) {
        this.handleCountry = handleCountry;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return getId()+","+getName()+","+getPrice()+","+getQuantity()+","+getBrand()+","+getHandleCountry()+","+getStatus();
    }
    public String handlePhoneInf(){
        return  "id=" + getId() +
                ", name='" + getName() + "\'" +
                ", price=" + getPrice() +"\'" +
                ", quantity='" + getQuantity() + "\'" +
                ", brand=" + getBrand() + "\'" +
                ", handleCountry='" + getHandleCountry() +  "\'" +
                ", status='" + getStatus() +  "\'" +
                '}';
    }
}
