import java.util.Scanner;
public class Main08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        int maxDays = 0;
        if (year >= 1 && year <= 9999) {
            if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12) {
                maxDays = 31;
            }
            else if (month == 4 || month == 6 || month == 9 || month == 11) {
                maxDays = 30;
            }
            else if (month == 2) {
                if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
                    maxDays = 29;
                else
                    maxDays = 28;
            }
            if (month >= 1 && month <= 12 && day >= 1 && day <= maxDays)
                System.out.println("Valid");
            else
                System.out.println("Invalid");

        } else {
            System.out.println("Invalid");
        }
    }
}