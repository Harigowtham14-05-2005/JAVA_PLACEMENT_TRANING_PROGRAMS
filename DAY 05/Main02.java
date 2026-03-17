import java.util.Scanner;
public class Main02{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = Math.abs(num);
        int sum = 0;
        while(n>0){
            int l_d = n%10;
            sum = sum+l_d;
            n = n/10;
        }
        System.out.println(sum);
    }
}