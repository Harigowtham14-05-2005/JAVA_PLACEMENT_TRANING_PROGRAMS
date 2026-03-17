import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = Math.abs(num);
        int count = 0;
        if (n==0){
            count = 1;
        }else{
            count= String.valueOf(n).length();
        }
        System.out.print(count);
    }
}