import java.util.Scanner;

public class Eighth {
    public static void allSquences(int n, int k, int[] sequence, int ind) {
        if (ind == n) {
            printSeq(sequence);
            return;
        }

        for (int i = 1; i <= k; i++) {
            sequence[ind] = i;
            allSquences(n, k, sequence, ind + 1);
        }
    }

    public static void printSeq(int[] sequence) {
        for (int i = 0; i < sequence.length; i++) {
            System.out.print(sequence[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        allSquences(n, k, new int[n], 0);
    }
}
