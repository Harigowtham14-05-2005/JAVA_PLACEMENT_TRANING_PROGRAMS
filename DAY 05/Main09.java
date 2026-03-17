import java.util.Scanner;

public class Main09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] freq = new int[10];
        if (n < 0) {
            n = -n;
        }
        if (n == 0) {
            freq[0] = 1;
        }

        while (n > 0) {
            int digit = n % 10;
            freq[digit]++;
            n = n / 10;
        }

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println(i + ": " + freq[i]);
            }
        }
    }
}