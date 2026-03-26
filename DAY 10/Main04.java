import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        if (s.length() == 0) {
            System.out.println("false");
            return;
        }

        boolean isDigitsOnly = true;

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                isDigitsOnly = false;
                break;
            }
        }

        System.out.println(isDigitsOnly ? "true" : "false");
        sc.close();
    }
}