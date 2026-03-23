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

        boolean found = false;

        for (int i = 0; i < r; i++) {
            int minVal = matrix[i][0];

            for (int j = 1; j < c; j++) {
                if (matrix[i][j] < minVal) {
                    minVal = matrix[i][j];
                }
            }

            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == minVal) {
                    boolean isColMax = true;

                    for (int k = 0; k < r; k++) {
                        if (matrix[k][j] > minVal) {
                            isColMax = false;
                            break;
                        }
                    }

                    if (isColMax) {
                        System.out.println(i + " " + j + " " + minVal);
                        found = true;
                    }
                }
            }
        }

        if (!found) {
            System.out.println("No Saddle Point");
        }
    }
}