import java.util.Scanner;

public class Main09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < c; j++) {
            int i = 0, k = j;
            while (i < r && k >= 0) {
                System.out.print(matrix[i][k] + " ");
                i++;
                k--;
            }
        }

        for (int i = 1; i < r; i++) {
            int j = c - 1, k = i;
            while (k < r && j >= 0) {
                System.out.print(matrix[k][j] + " ");
                k++;
                j--;
            }
        }
    }
}