import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int last = n % 10;
        int secondLast = (n / 10) % 10;
        int sum = last + secondLast;
        System.out.println(sum);
    }
}