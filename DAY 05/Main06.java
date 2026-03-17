import java.util.Scanner;
public class Main06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int slow = n;
        int fast = n;
        while (true) {
            int sum1 = 0;
            while (slow > 0) {
                int d = slow % 10;
                sum1 += d * d;
                slow /= 10;
            }
            slow = sum1;
            int sum2 = 0;
            while (fast > 0) {
                int d = fast % 10;
                sum2 += d * d;
                fast /= 10;
            }
            int sum3 = 0;
            while (sum2 > 0) {
                int d = sum2 % 10;
                sum3 += d * d;
                sum2 /= 10;
            }
            fast = sum3;

            if (fast == 1 || slow == 1) {
                System.out.println("Happy");
                break;
            }
            if (slow == fast) {
                System.out.println("Not Happy");
                break;
            }
        }
    }
}