package case_study_furama_resort.models;

public class House extends Facility {
    private String roomStandard;
    private int numberOfFloors;

    public House() {
    }

    public House(String nameService, double area, double price, int qualityMaxPeople, String typeRent, String roomStandard, int numberOfFloors) {
        super(nameService, area, price, qualityMaxPeople, typeRent);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}
