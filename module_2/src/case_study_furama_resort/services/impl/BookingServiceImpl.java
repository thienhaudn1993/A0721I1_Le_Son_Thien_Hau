package case_study_furama_resort.services.impl;

import case_study_furama_resort.models.Booking;
import case_study_furama_resort.models.Customer;
import case_study_furama_resort.models.Facility;
import case_study_furama_resort.models.Villa;
import case_study_furama_resort.services.BookingService;
import case_study_furama_resort.utils.BookingComparator;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    static Scanner scanner = new Scanner(System.in);
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    static List<Customer> customerList = new ArrayList<>();
    static Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
    static {
        customerList.add(new Customer("cm-1","hau",28,"male","123123",1,"thienhaudn@gmail.com","VIP","DN"));
        customerList.add(new Customer("cm-2","phuong",25,"famale","6756345",1,"phuongho@gmail.com","VIP","NA"));
        facilityIntegerMap.put(new Villa("1","Villa 1",120,250,5,"Day","Vip",80,3),0);
        facilityIntegerMap.put(new Villa("2","Villa 2",80,130,2,"Day","Normal",50,1),0);
    }

    @Override
    public void addBooking() {
        int id =1;
        if (!bookingSet.isEmpty()){
            id=bookingSet.size();
        }
        Customer customer = chooseCustomer();
        Facility facility = chooseFacility();
        System.out.println("Nhập ngày bắt đầu thuê");
        String startDate = scanner.nextLine();
        System.out.println("Nhập ngày kết thúc thuê");
        String endDate = scanner.nextLine();
        Booking booking = new Booking(id,startDate,endDate,customer,facility);
        bookingSet.add(booking);
        System.out.println("Đã booking thành công");
    }

    @Override
    public void displayListBooking() {
        for (Booking booking:bookingSet) {
            System.out.println(booking.toString());
        }
    }


    public static Customer chooseCustomer(){
        System.out.println("Danh sách khách hàng");
        for (Customer customer:customerList) {
            System.out.println(customer.toString());
        }
        System.out.println("Nhập id của khách hàng");
        boolean check = true;
        String id = scanner.nextLine();
        while (check){
            for (Customer customer:customerList){
                if (id.equals(customer.getId())){
                    check=false;
                    return customer;
                }
            }
            if (check){
                System.out.println("Bạn đã nhập sai ID, vui lòng nhập lại");
                id = scanner.nextLine();
            }
        }
        return null;
    }
    public static Facility chooseFacility(){
        System.out.println("Danh sách dịch vụ");
        for (Map.Entry<Facility,Integer> entry : facilityIntegerMap.entrySet()) {
            System.out.println(entry.getKey().toString());
        }
        System.out.println("Nhập id của dịch vụ");
        boolean check = true;
        String id = scanner.nextLine();
        while (check){
            for (Map.Entry<Facility,Integer> entry : facilityIntegerMap.entrySet()){
                if (id.equals(entry.getKey().getIsFacility())){
                    check=false;
                    return entry.getKey();
                }
            }
            if (check){
                System.out.println("Bạn đã nhập sai ID dịch vụ, vui lòng nhập lại");
                id = scanner.nextLine();
            }
        }
        return null;
    }
    // pt đển gửi danh sách booking qua class Contract
    public Set<Booking> sendBooking(){
        return bookingSet;
    }
}
