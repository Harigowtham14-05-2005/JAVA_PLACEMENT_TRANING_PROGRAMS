import java.util.Scanner;

public class Main07 {
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

        if (r == 1) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[0][j] + " ");
            }
            return;
        }

        if (c == 1) {
            for (int i = 0; i < r; i++) {
                System.out.print(matrix[i][0] + " ");
            }
            return;
        }

        for (int j = 0; j < c; j++) {
            System.out.print(matrix[0][j] + " ");
        }

        for (int i = 1; i < r; i++) {
            System.out.print(matrix[i][c - 1] + " ");
        }

        for (int j = c - 2; j >= 0; j--) {
            System.out.print(matrix[r - 1][j] + " ");
        }
        
        for (int i = r - 2; i > 0; i--) {
            System.out.print(matrix[i][0] + " ");
        }
    }
}