import java.util.Scanner;
public class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();
        double miles = km * 0.621371;
        System.out.printf("%.2f", miles);
    }
}