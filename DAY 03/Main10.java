import java.util.Scanner;
public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = {"zero","one","two","three","four",
                          "five","six","seven","eight","nine"};
        int d1 = n / 100;
        int d2 = (n / 10) % 10;
        int d3 = n % 10;
        System.out.println(words[d1] + " " + words[d2] + " " + words[d3]);
    }
}