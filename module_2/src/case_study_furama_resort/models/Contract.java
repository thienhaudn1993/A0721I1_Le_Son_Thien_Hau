package case_study_furama_resort.models;

public class Contract {
    private String numberContract;
    private Booking booking;
    private double pre;
    private double totalPayment;
    private Customer customer;

    public Contract() {
    }

    public Contract(String numberContract, Booking booking, double pre, double totalPayment, Customer customer) {
        this.numberContract = numberContract;
        this.booking = booking;
        this.pre = pre;
        this.totalPayment = totalPayment;
        this.customer = customer;
    }

    public String getNumberContract() {
        return numberContract;
    }

    public void setNumberContract(String numberContract) {
        this.numberContract = numberContract;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public double getPre() {
        return pre;
    }

    public void setPre(double pre) {
        this.pre = pre;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "numberContract='" + numberContract + '\'' +
                ", Idbooking=" + booking.getIdBooking() +
                ", preMomney=" + pre +
                ", totalPayment=" + totalPayment +
                ", idCustomer=" + customer.getId() +
                '}';
    }
}
