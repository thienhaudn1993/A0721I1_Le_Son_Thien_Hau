package case_study_furama_resort.models;

public class Room extends Facility {
    private String freeServiceIncluded;

    public Room() {
    }

    public Room(String nameService, double area, double price, int qualityMaxPeople, String typeRent, String freeServiceIncluded) {
        super(nameService, area, price, qualityMaxPeople, typeRent);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }


}
