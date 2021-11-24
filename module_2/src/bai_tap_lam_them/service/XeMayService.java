package bai_tap_lam_them.service;

import bai_tap_lam_them.model.XeMay;
import bai_tap_lam_them.model.XeOTo;
import bai_tap_lam_them.util.CSVHepler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeMayService {
    private final String path="src/bai_tap_lam_them/data/xeMay.csv";
    private final String path1="src/bai_tap_lam_them/data/hangSanXuat.csv";
    private static List<XeMay> xeMayList = new ArrayList<>();
    private static CSVHepler<XeMay> xeMayCSVHepler = new CSVHepler<>();
    private static Scanner scanner = new Scanner(System.in);

    public XeMayService() {
        xeMayList = getAll();
    }

    public List<XeMay> getAll(){
        xeMayList.clear();
        List<String> lines = xeMayCSVHepler.read(path);
        for (String line:lines) {
            String[]arr = line.split(",");
            XeMay xeMay = new XeMay(arr[0],arr[1],Integer.parseInt(arr[2]),arr[3],Double.parseDouble(arr[4]));
            xeMayList.add(xeMay);
        }
        return xeMayList;
    }
    public void show(List<XeMay> xeMayList){
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-20s %-20s %-20s %-20s %-20s%n", "Biển kiểm soát", "Hãng xe", "Năm sản xuất", "Chủ sở hữu", "Công suất");
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        for (XeMay xeMay:xeMayList) {
            System.out.printf("%-20s %-20s %-20s %-20s %-20s%n", xeMay.getBienKiemSoat(), xeMay.getHangXe(), xeMay.getNamSanXuat(), xeMay.getChuSoHuu(), xeMay.getCongSuat());
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------");

    }
    public void show(){
        show(xeMayList);
    }
    public void create(){
        boolean check;
        String bienKiemSoat;
        do {
            System.out.println("Nhập biển kiểm soát xe máy");
            bienKiemSoat = scanner.nextLine();
            String regex = "^[0-9]{2}-[A-Z][A-Z0-9]-[0-9]{3}.[0-9]{2}$";
            check = bienKiemSoat.matches(regex);
            System.out.println(check?"Bạn đã nhập đúng":"Bạn đã nhập sai định dạng biển số xe, vui lòng nhập lại");
        }while (!check);

        System.out.println("Hãng sản xuất xe máy gồm:");
        List<String> listHangXe = xeMayCSVHepler.read(path1);
        for (int i = 0; i < listHangXe.size(); i++) {
            System.out.println(listHangXe.get(i));
        }
        System.out.println("Nhập hãng sản xuất xe là:");
        String hangXe = scanner.nextLine();
        System.out.println("Năm sản xuất xe");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("Chủ sở hữu xe");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Nhập công suất xe");
        double congSuat = Double.parseDouble(scanner.nextLine());
        XeMay xeMay = new XeMay(bienKiemSoat,hangXe,namSanXuat,chuSoHuu,congSuat);
        xeMayList.add(xeMay);
        xeMayCSVHepler.write(xeMayList,path);
    }
    public boolean searchBks( String bks){
        for (XeMay xeMay:xeMayList) {
            if (xeMay.getBienKiemSoat().contains(bks)){
                return true;
            }
        }
        return false;
    }
    public void delete(String bks){
        for (int i = 0; i < xeMayList.size(); i++) {
            if (bks.equals(xeMayList.get(i).getBienKiemSoat())){
                xeMayList.remove(i);
            }
        }
        xeMayCSVHepler.write(xeMayList,path);
    }
}
