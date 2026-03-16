import java.util.Scanner;
public class Main01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int l = sc.nextInt();
        for(int i = f; i <= l; i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}