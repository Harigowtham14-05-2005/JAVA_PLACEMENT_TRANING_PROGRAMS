import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        StringBuilder result = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {

            if (i == 0 || s.charAt(i - 1) == ' ') {

                char ch = s.charAt(i);

                if (Character.isLetter(ch)) {
                    result.setCharAt(i, Character.toUpperCase(ch));
                }
            }
        }

        System.out.println(result.toString());
        sc.close();
    }
}