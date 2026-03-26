import java.util.*;

public class Main06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            }
        }
        if (freq.isEmpty()) {
            System.out.println("None");
            return;
        }

        int maxFreq = 0;
        char result = ' ';
        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                int count = freq.get(ch);

                if (count > maxFreq) {
                    maxFreq = count;
                    result = ch;
                }
            }
        }

        System.out.println(result);
        sc.close();
    }
}