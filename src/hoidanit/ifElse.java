package hoidanit;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số thu nhập: ");
        int inner = scanner.nextInt();
        if (inner < 10) {
            System.out.println("Thuế thu nhập của bạn là 0%");
        } else if (inner > 10 && inner < 15) {
            System.out.println("Thuế thu nhập của bạn là 10%");
        } else if (inner > 15 && inner < 30) {
            System.out.println("Thuế thu nhập của bạn là 20%");
        } else {
            System.out.println("Thuế thu nhập của bạn là 50%");
        }
        scanner.close();
    }
}
