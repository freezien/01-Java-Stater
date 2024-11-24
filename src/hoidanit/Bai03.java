package hoidanit;

import java.util.Scanner;

public class Bai03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh lập phương = ");
        int canh = scanner.nextInt();
        double theTich = Math.pow(canh, 3);
        System.out.println("Thể tích khối lập phương = " + theTich);

        scanner.close();
    }
}
