import java.util.Scanner;
import java.util.HashMap;

public class Main04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int val = sc.nextInt();
                map.put(val, map.getOrDefault(val, 0) + 1);
            }
        }

        int maxFreq = 0;
        int result = Integer.MAX_VALUE;

        for (int key : map.keySet()) {
            int freq = map.get(key);

            if (freq > maxFreq) {
                maxFreq = freq;
                result = key;
            } else if (freq == maxFreq && key < result) {
                result = key;
            }
        }

        System.out.print(result);
    }
}