import java.util.Scanner;
public class Main08{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Not Palindrome");
            return;
        }
        int reverse = 0;
        int original = num;
        while(num>0){
            int digit = num%10;
            reverse = reverse*10+digit;
            num = num/10;
        }
        if(reverse==original){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}