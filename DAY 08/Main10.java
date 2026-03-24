import java.util.*;

public class Main10 {
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

        boolean up = true;

        for (int d = 0; d < r + c - 1; d++) {
            int row = d < c ? 0 : d - c + 1;
            int col = d < c ? d : c - 1;

            ArrayList<Integer> temp = new ArrayList<>();

            while (row < r && col >= 0) {
                temp.add(matrix[row][col]);
                row++;
                col--;
            }

            if (up) {
                for (int i = temp.size() - 1; i >= 0; i--) {
                    System.out.print(temp.get(i) + " ");
                }
            } else {
                for (int i = 0; i < temp.size(); i++) {
                    System.out.print(temp.get(i) + " ");
                }
            }

            up = !up;
        }
    }
}