import java.util.Scanner;
public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();
        long meters = Math.round(km * 1000);
        long centimeters = Math.round(km * 100000);
        long millimeters = Math.round(km * 1000000);
        System.out.println(meters);
        System.out.println(centimeters);
        System.out.println(millimeters);
    }
}