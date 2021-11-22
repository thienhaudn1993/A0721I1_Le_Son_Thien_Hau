package bai_tap_lam_them.service;

import bai_tap_lam_them.model.XeTai;
import bai_tap_lam_them.util.CSVHepler;
import demo_manager_school.model.Student;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeTaiService {
    private final String path="src/bai_tap_lam_them/data/xeTai.csv";
    private static List<XeTai> xeTaiList = new ArrayList<>();
    private static CSVHepler<XeTai> xeTaiCSVHelper = new CSVHepler<>();
    private static Scanner scanner = new Scanner(System.in);

    public XeTaiService() {
        xeTaiList = getAll();
    }

    public List<XeTai> getAll(){
        xeTaiList.clear();
        List<String> lines = xeTaiCSVHelper.read(path);
        for (String line:lines) {
            String[]arr = line.split(",");
            XeTai xeTai = new XeTai(arr[0],arr[1],Integer.parseInt(arr[2]),arr[3],Double.parseDouble(arr[4]));
            xeTaiList.add(xeTai);
        }
        return xeTaiList
    }
    public void show(List<XeTai> xeTaiList){
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.printf("%-10s %-20s %-20s %-20s %-20s %-20s%n", "Biển kiểm soát", "Hãng xe", "Năm sản xuất", "Chủ sở hữu", "Tải trọng xe");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        for (XeTai xeTai:xeTaiList) {
            System.out.printf("%-10s %-20s %-20s %-20s %-20s %-20s%n", xeTai.getBienKiemSoat(), xeTai.getHangXe(), xeTai.getNamSanXuat(), xeTai.getChuSoHuu(), xeTai.getTrongTai());
        }
        System.out.println("--------------------------------------------------------------------------------------------------------");

    }
    public void show(){
        show(xeTaiList);
    }
    public void create(){
        System.out.println("Nhập biển kiểm soát xe");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("Hãng sản xuất xe");
        String hangXe = scanner.nextLine();
        System.out.println("Năm sản xuất xe");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("Chủ sở hữu xe");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Nhập tải trọng xe");
        double taiTrong = Double.parseDouble(scanner.nextLine());
        XeTai xeTai = new XeTai(bienKiemSoat,hangXe,namSanXuat,chuSoHuu,taiTrong);
        xeTaiList.add(xeTai);
        xeTaiCSVHelper.write(xeTaiList,path);
    }
    public void edit(){

    }

}
