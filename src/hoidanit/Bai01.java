import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ho va Ten: ");
        String hoten = scanner.nextLine();
        System.out.println("Điểm sô: ");
        int average = scanner.nextInt();
        System.out.println("Ho va Ten: " + hoten + ", Điểm: " + average);

        scanner.close();
    }

}
