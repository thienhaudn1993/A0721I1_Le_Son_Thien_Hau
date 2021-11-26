package thi_modul2.service;

public class NotFoundProductException extends RuntimeException {
    public NotFoundProductException() {
    }

    public NotFoundProductException(String message) {
        super(message);
    }
}
