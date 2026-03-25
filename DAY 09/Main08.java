import java.util.*;

public class Main08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String s2 = sc.nextLine().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}