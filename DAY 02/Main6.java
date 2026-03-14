import java.util.Scanner;
public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int n100 = amount / 100;
        amount = amount % 100;
        int n50 = amount / 50;
        amount = amount % 50;
        int n20 = amount / 20;
        amount = amount % 20;
        int n10 = amount / 10;
        amount = amount % 10;
        int n5 = amount / 5;
        amount = amount % 5;
        int n2 = amount / 2;
        amount = amount % 2;
        int n1 = amount;
        System.out.println(n100);
        System.out.println(n50);
        System.out.println(n20);
        System.out.println(n10);
        System.out.println(n5);
        System.out.println(n2);
        System.out.println(n1);
    }
}