import java.util.Scanner;

public class ArrayMatrix {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int matrix[][] = new int[n + 1][n + 1];

            int u, v;
            for (int i = 0; i < m; i++) {
                u = scan.nextInt();
                v = scan.nextInt();
                matrix[u][v] = 1;
                matrix[v][u] = 1;
            }

            print(matrix);
        }
    }

    static void print(int[][] matrix) {
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
