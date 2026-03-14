import java.util.Scanner;
public class Main1{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int last_digit = num % 10;
        System.out.println(last_digit);
    }
}