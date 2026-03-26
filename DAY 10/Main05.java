import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if ("aeiouAEIOU".indexOf(ch) == -1) {
                result.append(ch);
            }
        }

        System.out.println(result.toString());
        sc.close();
    }
}