import java.util.Scanner;
public class Main03{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sign = (n<0)?-1:1;
        n = Math.abs(n);
        int reverse = 0;
        while(n>0){
            int l_d = n%10;
            reverse = reverse*10+l_d;
            n = n/10;
        }
        reverse = reverse * sign;
        System.out.println(reverse);
    }
}