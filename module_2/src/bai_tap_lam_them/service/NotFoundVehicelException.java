package bai_tap_lam_them.service;

public class NotFoundVehicelException extends RuntimeException {
    public NotFoundVehicelException() {
    }

    public NotFoundVehicelException(String message) {
        super(message);
    }
}
