import java.util.Scanner;
public class Main04{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = Math.abs(n);
        int largest = 0;
        if(n==0){
            largest = 0;
        }else{
            while(n>0){
                int l_d = n%10;
                if (l_d > largest){
                    largest = l_d;
                }
                n = n/10;
            }
        }
        System.out.println(largest);
    }
}