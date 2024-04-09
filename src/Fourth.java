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
        int b = sc.nextInt();
        int n = sc.nextInt();
        int res = sumOfPowers(b, n);
        System.out.println(res);
    }
}

