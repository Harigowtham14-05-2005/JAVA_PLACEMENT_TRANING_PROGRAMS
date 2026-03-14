import java.util.Scanner;
public class Main06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        int bill = 0;
        if (units <= 100) {
            bill = 0;
        }
        else if (units <= 300) {
            bill = (units - 100) * 3;
        }
        else {
            bill = (200 * 3) + (units - 300) * 5;
        }
        System.out.println(bill);
    }
}