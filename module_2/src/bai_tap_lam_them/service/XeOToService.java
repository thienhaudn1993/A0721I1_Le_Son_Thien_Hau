package bai_tap_lam_them.service;

import bai_tap_lam_them.model.XeOTo;
import bai_tap_lam_them.util.CSVHepler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeOToService {
    private final String path="src/bai_tap_lam_them/data/oto.csv";
    private final String path1="src/bai_tap_lam_them/data/hangSanXuat.csv";
    private static List<XeOTo> xeOToList = new ArrayList<>();
    private static CSVHepler<XeOTo> xeOToCSVHepler = new CSVHepler<>();
    private static Scanner scanner = new Scanner(System.in);

    public XeOToService() {
        xeOToList = getAll();
    }

    public List<XeOTo> getAll(){
        xeOToList.clear();
        List<String> lines = xeOToCSVHepler.read(path);
        for (String line:lines) {
            String[]arr = line.split(",");
            XeOTo xeOTo = new XeOTo(arr[0],arr[1],Integer.parseInt(arr[2]),arr[3],Integer.parseInt(arr[4]),arr[5]);
            xeOToList.add(xeOTo);
        }
        return xeOToList;
    }
    public void show(List<XeOTo> xeOToList){
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s%n", "Biển kiểm soát", "Hãng xe", "Năm sản xuất", "Chủ sở hữu", "Số chỗ ngồi","Kiểu xe");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        for (XeOTo xeOTo:xeOToList) {
            System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s%n", xeOTo.getBienKiemSoat(), xeOTo.getHangXe(), xeOTo.getNamSanXuat(), xeOTo.getChuSoHuu(), xeOTo.getSoChoNgoi(), xeOTo.getKieuXe());
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");

    }
    public void show(){
        show(xeOToList);
    }
    public void create(){
        boolean check;
        String bienKiemSoat;
        do {
            System.out.println("Nhập biển kiểm soát xe ôTô");
            bienKiemSoat = scanner.nextLine();
            String regex = "^[0-9]{2}[A|B]-[0-9]{3}.[0-9]{2}$";
            check = bienKiemSoat.matches(regex);
            System.out.println(check?"Bạn đã nhập đúng":"Bạn đã nhập sai định dạng biển số xe, vui lòng nhập lại");
        }while (!check);

        System.out.println("Hãng sản xuất xe ôTô gồm:");
        List<String> listHangXe = xeOToCSVHepler.read(path1);
        for (int i = 0; i < listHangXe.size(); i++) {
            System.out.println(listHangXe.get(i));
        }
        System.out.println("Nhập hãng sản xuất xe");
        String hangXe = scanner.nextLine();
        System.out.println("Năm sản xuất xe");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("Chủ sở hữu xe");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Nhập số chỗ ngồi");
        int soChoNgoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu xe");
        System.out.println("Lưu ý biển số A là sẽ du lịch, biến số B là xe khách");
        String kieuXe = scanner.nextLine();
        XeOTo xeOTo = new XeOTo(bienKiemSoat,hangXe,namSanXuat,chuSoHuu,soChoNgoi,kieuXe);
        xeOToList.add(xeOTo);
        xeOToCSVHepler.write(xeOToList,path);
    }
    public boolean searchBks( String bks){
        for (XeOTo xeOTo:xeOToList) {
            if (xeOTo.getBienKiemSoat().contains(bks)){
                return true;
            }
        }
        return false;
    }
    public void delete(String bks){
        for (int i = 0; i < xeOToList.size(); i++) {
            if (bks.equals(xeOToList.get(i).getBienKiemSoat())){
                xeOToList.remove(i);
            }
        }
        xeOToCSVHepler.write(xeOToList,path);
    }
}
