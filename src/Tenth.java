import java.util.Scanner;

public class Tenth {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0)
            return false;
        else if (n == 1)
            return true;
        else if (n % 2 == 0)
            return isPowerOfTwo(n / 2);
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.print(i + " is ");
            if (isPowerOfTwo(i))
                System.out.println("a power of two");
            else
                System.out.println("not a power of two");
        }
    }
}

