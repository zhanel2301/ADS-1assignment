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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first num: ");
        int n = sc.nextInt();
        System.out.println("Enter the second num: ");
        int k = sc.nextInt();
        allSquences(n, k, new int[n], 0);
    }
}
