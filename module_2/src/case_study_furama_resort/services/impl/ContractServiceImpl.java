package case_study_furama_resort.services.impl;

import case_study_furama_resort.models.Booking;
import case_study_furama_resort.models.Contract;
import case_study_furama_resort.models.Customer;
import case_study_furama_resort.services.ContractService;

import java.util.*;

public class ContractServiceImpl implements ContractService {
    static List<Contract> contractList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void createNewContract() {
        Queue<Booking> bookingQueue = new LinkedList<>();
        Set<Booking> bookingSet = new BookingServiceImpl().sendBooking();
        for (Booking booking:bookingSet) {
            bookingQueue.add(booking);
        }
        while (!bookingQueue.isEmpty()){
            Booking booking = bookingQueue.poll();
            Customer customer = booking.getCustomer();
            System.out.println("Đang tạo hợp đồng cho booking có thông tin "+booking.toString());
            System.out.println("Đang tạo hợp đồng cho khách hàng có thông tin "+customer.toString());
            System.out.println("Nhập mã số hợp đồng");
            String id = scanner.nextLine();
            System.out.println("Nhập số tiền cọc trước");
            double pre = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập tổng số tiền càn thanh toán");
            double total = Double.parseDouble(scanner.nextLine());
            Contract contract = new Contract(id,booking,pre,total,customer);
            contractList.add(contract);
            System.out.println("Đã tạo hợp đồng thành công "+contract.toString());
        }
    }

    @Override
    public void displayListContract() {
        for (Contract contract:contractList) {
            System.out.println(contract.toString());
        }
    }

    @Override
    public void editContract() {
        /*System.out.println("Danh sách hợp đồng hiện tại");
        displayListContract();
        System.out.println("Nhập mã hợp đồng cẩn chỉnh sửa");
        String editNumberContract = scanner.nextLine();
        for (int i = 0; i < contractList.size(); i++) {
            if (editNumberContract.equals(contractList.get(i).getNumberContract())){
                System.out.println();
            }
        }*/

    }
}
