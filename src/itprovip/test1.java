package itprovip;

public class test1 {
    public static void main(String[] args) {
        int[] ages = { 20, 22, 25, 27, 29, 33, 87, 70 };

        int sum = 0;
        int min = ages[0];
        int max = ages[0];

        for (int age : ages) {
            sum += age;
            if (min > age) {
                min = age;
            }
            if (max < age) {
                max = age;
            }
        }

        double average = (double) sum / ages.length;
        System.out.println("Tong la la " + sum);
        System.out.println("Trung binh tuoi la " + average);
        System.out.println("min " + min);
        System.out.println("max " + max);
    }
}
