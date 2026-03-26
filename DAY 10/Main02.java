import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char startChar = sc.next().charAt(0);
        char endChar = sc.next().charAt(0);

        int startIndex = s.indexOf(startChar);

        if (startIndex == -1) {
            System.out.println("");
            return;
        }

        int endIndex = s.indexOf(endChar, startIndex + 1);

        if (endIndex == -1) {
            System.out.println("");
            return;
        }

        String result = s.substring(startIndex + 1, endIndex);
        System.out.println(result);

        sc.close();
    }
}