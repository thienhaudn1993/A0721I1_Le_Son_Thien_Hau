package case_study_furama_resort.models;

public abstract class Facility {
    private String nameService;
    private double area;
    private double price;
    private int qualityMaxPeople;
    private String typeRent;

    public Facility() {
    }

    public Facility(String nameService, double area, double price, int qualityMaxPeople, String typeRent) {
        this.nameService = nameService;
        this.area = area;
        this.price = price;
        this.qualityMaxPeople = qualityMaxPeople;
        this.typeRent = typeRent;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQualityMaxPeople() {
        return qualityMaxPeople;
    }

    public void setQualityMaxPeople(int qualityMaxPeople) {
        this.qualityMaxPeople = qualityMaxPeople;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "nameService='" + nameService + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", qualityMaxPeople=" + qualityMaxPeople +
                ", typeRent='" + typeRent + '\'' +
                '}';
    }
}
