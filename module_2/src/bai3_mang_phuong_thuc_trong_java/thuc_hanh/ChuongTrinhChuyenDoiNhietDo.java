package bai3_mang_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

public class ChuongTrinhChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int input;
        do {
            System.out.println("Menu:");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit ");
            input = scanner.nextInt();
            switch (input){
                case 1:
                    System.out.println("Input Fahrenheit");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("Fahrenheit to Celsius: "+fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Input celsius");
                    celsius = scanner.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " +celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        }while (input !=0);
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
}