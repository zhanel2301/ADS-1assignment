import java.util.Scanner;

public class Fourth {
    public static int sumOfPowers(int b, int n) {
        if (n == 0)
            return 1;
        else
            return (int)Math.pow(b, n) + sumOfPowers(b, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first num: ");
        int b = sc.nextInt();
        System.out.println("Enter the second num: ");
        int n = sc.nextInt();
        int res = sumOfPowers(b, n);
        System.out.println("The sum of the first " + n + " powers of a base " + b + " : " + res);
    }
}

