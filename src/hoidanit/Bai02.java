package hoidanit;

import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập chiều dài =  ");
        int dai = scanner.nextInt();

        System.out.printf("Nhập chiều rộng =  ");
        int rong = scanner.nextInt();

        System.out.println("Chu vi =  " + (dai + rong) * 2);
        System.out.println("Diện tích =  " + (dai * rong));
        System.out.println("Cạnh nhỏ nhất =  " + Math.min(dai, rong));

        scanner.close();
    }
}
