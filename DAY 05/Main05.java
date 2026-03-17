import java.util.*;
public class Main05{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("None");
            System.out.println("0");
            return;
        }
        n = Math.abs(n);
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                even.add(digit);
            } else {
                odd.add(digit);
            }
            
            n = n / 10;
        }
        if (odd.isEmpty()) {
            System.out.println("None");
        } else {
            for (int i = odd.size() - 1; i >= 0; i--) {
                System.out.print(odd.get(i) + " ");
            }
            System.out.println();
        }
        if (even.isEmpty()) {
            System.out.println("None");
        } else {
            for (int i = even.size() - 1; i >= 0; i--) {
                System.out.print(even.get(i) + " ");
            }
        }
    }
}