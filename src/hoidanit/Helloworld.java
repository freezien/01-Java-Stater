package hoidanit;

import java.util.Scanner;

public class Helloworld {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("First Number: " + Math.sqrt(256));
        int firstnumber = scanner.nextInt();
        System.out.println("Second Number: ");
        int secondnumber = scanner.nextInt();
        System.out.println(
                "Min= " + Math.min(firstnumber, secondnumber) + " Max = " + Math.max(firstnumber, secondnumber));
        scanner.close();
    }
}
