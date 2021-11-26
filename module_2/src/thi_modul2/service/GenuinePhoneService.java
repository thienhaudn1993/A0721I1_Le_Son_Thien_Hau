package thi_modul2.service;


import bai_tap_lam_them.model.XeMay;
import demo_manager_school.model.Student;
import thi_modul2.model.GenuinePhone;
import thi_modul2.util.CSVHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenuinePhoneService {
    private static List<GenuinePhone> genuinePhoneList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private CSVHelper<GenuinePhone> genuinePhoneCSVHelper = new CSVHelper<>();
    private final String PATH="src/thi_modul2/data/genuinemobiles.csv";

    public GenuinePhoneService() {
        genuinePhoneList = getAll();
    }
    public List<GenuinePhone> getAll(){
        genuinePhoneList.clear();
        List<String> lines = genuinePhoneCSVHelper.read(PATH);
        for (String line:lines) {
            String[]arr = line.split(",");
            GenuinePhone genuinePhone = new GenuinePhone(Integer.parseInt(arr[0]),arr[1],Double.parseDouble(arr[2]),Integer.parseInt(arr[3]),arr[4],arr[5],arr[6]);
            genuinePhoneList.add(genuinePhone);
        }
        return genuinePhoneList;
    }
    public void save(GenuinePhone genuinePhone){
        if (genuinePhone.getId()>0) {
            //edit
            int index = genuinePhoneList.indexOf(genuinePhone);
            genuinePhoneList.set(index,genuinePhone);
        }else {
            //add
            genuinePhone.setId(genuinePhoneList.size()+1);
            genuinePhoneList.add(genuinePhone);
        }
        genuinePhoneCSVHelper.write(genuinePhoneList,PATH);
    }
    public void inputAndSave(int id){
        System.out.println("Nhập tên điện thoại");
        String name = scanner.nextLine();
        System.out.println("Nhập giá bán");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số lượng");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập nhà sản xuất");
        String brand = scanner.nextLine();
        System.out.println("Nhập thời gian bảo hành");
        String warrantyTime = scanner.nextLine();
        System.out.println("Nhập phạm vi bảo hành");
        String warrantyArea = scanner.nextLine();
        GenuinePhone genuinePhone = new GenuinePhone(id,name,price,quantity,brand,warrantyTime,warrantyArea);
        save(genuinePhone);
    }
    public void create(){
        inputAndSave(0);
        System.out.println("Đã tạo thành công");

    }
    public void edit(){
//        show();
        System.out.println("Nhập id bạn muốn edit");
        int id = Integer.parseInt(scanner.nextLine());
        inputAndSave(id);
        System.out.println("Chỉnh sửa thành công");

    }
    public void delete(int id) {
        for (int i = 0; i < genuinePhoneList.size(); i++) {
            if (id==genuinePhoneList.get(i).getId()){
                genuinePhoneList.remove(i);
            }
        }
        genuinePhoneCSVHelper.write(genuinePhoneList,PATH);
    }
    public void delete(){
        show();
        System.out.println("Nhập ID bạn muốn xóa");
        int id = Integer.parseInt(scanner.nextLine());
        delete(id);
        System.out.println("Bạn đã xóa thành công");
    }
    public void show(List<GenuinePhone> genuinePhoneList){
        System.out.println("Danh sách điện thoại chính hãng");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-10s %-20s %-20s %-20s %-20s %-20s %-20s%n", "ID", "NAME", "PRICE", "QUANTITY", "BRAND", "WARRANTY TIME", " WARRANTY AREA");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
        for (GenuinePhone genuinePhone:genuinePhoneList) {
            System.out.printf("%-10s %-20s %-20s %-20s %-20s %-20s %-20s%n", genuinePhone.getId(), genuinePhone.getName(), genuinePhone.getPrice(), genuinePhone.getQuantity(), genuinePhone.getBrand(), genuinePhone.getWarrantyTime(),genuinePhone.getWarrantyArea());
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
    }
    public void show(){
        show(genuinePhoneList);
    }
    public void searchByName(){
        System.out.println("Nhập tên điện thoại tìm kiếm");
        String name = scanner.nextLine();
        for (GenuinePhone genuinePhone:genuinePhoneList) {
            if (genuinePhone.getName().contains(name)){
                System.out.println(genuinePhone.genuinePhoneInf());
            }
        }
    }

}
