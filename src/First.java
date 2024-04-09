import java.util.Scanner;

public class First {
    public static int sumOfSquares(int n) {
        if (n == 1)
            return 1;
        else
            return n * n + sumOfSquares(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int n = sc.nextInt();
        int res = sumOfSquares(n);
        System.out.println("The sum of the squares of the first " + n + " positive integers: " + res);
    }
}

