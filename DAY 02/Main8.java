import java.util.Scanner;
public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bit_position = sc.nextInt();
        int result = n ^ (1 << bit_position);
        System.out.println(result);
    }
}