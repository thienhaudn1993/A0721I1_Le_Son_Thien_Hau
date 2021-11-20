package case_study_furama_resort.services.impl;

import case_study_furama_resort.models.Facility;
import case_study_furama_resort.models.House;
import case_study_furama_resort.models.Room;
import case_study_furama_resort.models.Villa;
import case_study_furama_resort.services.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Map.Entry<Facility,Integer> entry: facilityIntegerMap.entrySet()) {
            System.out.println("Service "+entry.getKey()+" Số lần đã thuê "+entry.getValue());
        }
    }

    @Override
    public void displayMaintance() {

    }

    @Override
    public void addNewVilla() {
        System.out.println("Nhập mã số dịch vụ");
        String isFacility = scanner.nextLine();
        System.out.println("Nhập tên dịch vụ");
        String nameService = scanner.nextLine();
        System.out.println("Nhập diện tích phòng");
        double area = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập giá villa");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số lượng người tối đa");
        int qualityMaxPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu phòng");
        String typeRent = scanner.nextLine();
        System.out.println("Nhập tiêu chuẩn phòng");
        String roomStandard = scanner.nextLine();
        System.out.println("Nhập diện tích hồ bơi");
        double poolArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số tầng");
        int numberOfFloors = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(isFacility,nameService,area,price,qualityMaxPeople,typeRent,roomStandard,poolArea,numberOfFloors);
        facilityIntegerMap.put(villa,0);
        System.out.println("Đã thêm mới villa thành công");

    }

    @Override
    public void addNewHouse() {
        System.out.println("Nhập mã số dịch vụ");
        String isFacility = scanner.nextLine();
        System.out.println("Nhập tên dịch vụ");
        String nameService = scanner.nextLine();
        System.out.println("Nhập diện tích phòng");
        double area = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập giá villa");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số lượng người tối đa");
        int qualityMaxPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu phòng");
        String typeRent = scanner.nextLine();
        System.out.println("Nhập tiêu chuẩn phòng");
        String roomStandard = scanner.nextLine();
        System.out.println("Nhập số tầng");
        int numberOfFloors = Integer.parseInt(scanner.nextLine());
        House house = new House(isFacility,nameService,area,price,qualityMaxPeople,typeRent,roomStandard,numberOfFloors);
        facilityIntegerMap.put(house,0);
        System.out.println("Đã thêm mới house thành công");
    }

    @Override
    public void addNewRoom() {
        System.out.println("Nhập mã số dịch vụ");
        String isFacility = scanner.nextLine();
        System.out.println("Nhập tên dịch vụ");
        String nameService = scanner.nextLine();
        System.out.println("Nhập diện tích phòng");
        double area = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập giá villa");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số lượng người tối đa");
        int qualityMaxPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu phòng");
        String typeRent = scanner.nextLine();
        System.out.println("Nhập dịch vụ free kèm theo");
        String freeServiceIncluded = scanner.nextLine();
        Room room = new Room(isFacility,nameService,area,price,qualityMaxPeople,typeRent,freeServiceIncluded);
        facilityIntegerMap.put(room,0);
        System.out.println("Đã thêm mới room thành công");
    }
}
