package bai15_exception_debug.bai_tap_dung_illegaltriangleexception;

public class IllegalTriangleException extends RuntimeException {
    public IllegalTriangleException() {
    }

    public IllegalTriangleException(String message) {
        super(message);
    }
}
