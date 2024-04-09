import java.util.Scanner;

public class Seventh {
    public static void filledSquare(int[][] matrix, int start, int end, int n) {
        if (start > end)
            return;

        for (int i = start; i <= end; i++)
            matrix[start][i] = n++;

        for (int i = start + 1; i <= end; i++)
            matrix[i][end] = n++;

        for (int i = end - 1; i >= start; i--)
            matrix[end][i] = n++;

        for (int i = end - 1; i > start; i--)
            matrix[i][start] = n++;

        filledSquare(matrix, start + 1, end - 1, n);
    }

    public static void printMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int x = sc.nextInt();
        int[][] matrix = new int[x][x];
        filledSquare(matrix, 0, x - 1, 1);
        printMatrix(matrix);
    }
}
