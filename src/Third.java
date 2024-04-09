import java.util.Scanner;

public class Third {
    public static int sumOfInt(int n) {
        if (n == 1)
            return 1;
        else
            return n + sumOfInt(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int n = sc.nextInt();
        int res = sumOfInt(n);
        System.out.println("The sum of the first " + n + " positive integers: " + res);
    }
}

