import java.util.Scanner;

public class Main07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int k = sc.nextInt();

        int n = s.length();
        if (n == 0) {
            System.out.println("");
            return;
        }
        k = k % n;
        String result = s.substring(k) + s.substring(0, k);

        System.out.println(result);

        sc.close();
    }
}