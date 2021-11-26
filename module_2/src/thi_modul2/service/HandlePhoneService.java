package thi_modul2.service;

import thi_modul2.model.GenuinePhone;
import thi_modul2.model.HandlePhone;
import thi_modul2.util.CSVHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HandlePhoneService {
    private static List<HandlePhone> handlePhoneList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private CSVHelper<HandlePhone> handlePhoneCSVHelper = new CSVHelper<>();
    private final String PATH="src/thi_modul2/data/handlemobiles.csv";

    public HandlePhoneService() {
        handlePhoneList = getAll();
    }
    public List<HandlePhone> getAll(){
        handlePhoneList.clear();
        List<String> lines = handlePhoneCSVHelper.read(PATH);
        for (String line:lines) {
            String[]arr = line.split(",");
            HandlePhone handlePhone = new HandlePhone(Integer.parseInt(arr[0]),arr[1],Double.parseDouble(arr[2]),Integer.parseInt(arr[3]),arr[4],arr[5],arr[6]);
            handlePhoneList.add(handlePhone);
        }
        return handlePhoneList;
    }
    public void save(HandlePhone handlePhone){
        if (handlePhone.getId()>0) {
            //edit
            int index = handlePhoneList.indexOf(handlePhone);
            handlePhoneList.set(index,handlePhone);
        }else {
            //add
            handlePhone.setId(handlePhoneList.size()+1);
            handlePhoneList.add(handlePhone);
        }
        handlePhoneCSVHelper.write(handlePhoneList,PATH);
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
        System.out.println("Nhập quốc gia xách tay");
        String handleCountry = scanner.nextLine();
        System.out.println("Nhập trạng thái");
        String status = scanner.nextLine();
        HandlePhone handlePhone = new HandlePhone(id,name,price,quantity,brand,handleCountry,status);
        save(handlePhone);
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
        for (int i = 0; i < handlePhoneList.size(); i++) {
            if (id==handlePhoneList.get(i).getId()){
                handlePhoneList.remove(i);
            }
        }
        handlePhoneCSVHelper.write(handlePhoneList,PATH);
    }
    public void delete(){
        show();
        System.out.println("Nhập ID bạn muốn xóa");
        int id = Integer.parseInt(scanner.nextLine());
        delete(id);
        System.out.println("Bạn đã xóa thành công");
    }
    public void show(List<HandlePhone> handlePhoneList){
        System.out.println("Danh sách điện thoại xách tay");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-10s %-20s %-20s %-20s %-20s %-20s %-20s%n", "ID", "NAME", "PRICE", "QUANTITY", "BRAND", "HANDLE COUNTRY", " STATUS");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
        for (HandlePhone handlePhone:handlePhoneList) {
            System.out.printf("%-10s %-20s %-20s %-20s %-20s %-20s %-20s%n", handlePhone.getId(), handlePhone.getName(), handlePhone.getPrice(), handlePhone.getQuantity(), handlePhone.getBrand(), handlePhone.getHandleCountry(),handlePhone.getStatus());
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
    }
    public void show(){
        show(handlePhoneList);
    }
    public void searchByName(){
        System.out.println("Nhập tên điện thoại tìm kiếm");
        String name = scanner.nextLine();
        for (HandlePhone handlePhone:handlePhoneList) {
            if (handlePhone.getName().contains(name)){
                System.out.println(handlePhone.handlePhoneInf());
            }
        }
    }
}
