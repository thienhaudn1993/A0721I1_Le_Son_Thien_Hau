package bai18_string_regex.bai_tap.validate_sdt;

public class ValidatePhone {
    /**
    Viết phương thức để kiểm tra tính hợp lệ của số điên thoại.

    Số điện thoại hợp lệ cần đạt theo mẫu sau: (xx)-(0xxxxxxxxx)

    x là ký tự số

    Không chứa các ký tự đặc biệt

    Ví dụ số điện thoại hợp lệ: (84)-(0978489648)

    Ví dụ tên lớp không hợp lệ: (a8)-(22222222) **/
    public static boolean validatePhoneNumber(String phone){
        String regexPhone ="^\\d{2}-0\\d{9}$";
        return phone.matches(regexPhone);
    }
}
