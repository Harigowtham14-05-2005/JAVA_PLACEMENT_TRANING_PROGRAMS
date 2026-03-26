import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.contains(" ")) {
            System.out.println("Invalid");
            return;
        }
        int atIndex = s.indexOf('@');
        if (atIndex == -1 || atIndex != s.lastIndexOf('@')) {
            System.out.println("Invalid");
            return;
        }
        if (atIndex == 0 || atIndex == s.length() - 1) {
            System.out.println("Invalid");
            return;
        }
        String domain = s.substring(atIndex + 1);
        int dotIndex = domain.indexOf('.');
        if (dotIndex == -1) {
            System.out.println("Invalid");
            return;
        }
        if (dotIndex == 0 || dotIndex == domain.length() - 1) {
            System.out.println("Invalid");
            return;
        }
        System.out.println("Valid");
        sc.close();
    }
}