import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        boolean[] seen = new boolean[256];

        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!seen[ch]) {
                seen[ch] = true;
                result += ch;
            }
        }

        System.out.println(result);
    }
}