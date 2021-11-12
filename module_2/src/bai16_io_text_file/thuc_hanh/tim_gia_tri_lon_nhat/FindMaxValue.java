package bai16_io_text_file.thuc_hanh.tim_gia_tri_lon_nhat;

import java.util.List;
import java.util.Scanner;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đường dẫn cách tìm số lớn nhất");
        String filePath = scanner.nextLine();
        List<Integer> numbers = readAndWriteFile.readFile(filePath);
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("src/bai16_io_text_file/thuc_hanh/tim_gia_tri_lon_nhat/result.txt",maxValue);
    }
}
