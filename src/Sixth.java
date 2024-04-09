import java.util.Scanner;

public class Sixth {
    public static void reverseSeq(Scanner sc, int n) {
        if (n == 0) {
            return;
        } else {
            System.out.println("Enter sequence: ");
            char[] str = sc.next().toCharArray();
            reverseSeq(sc, n - 1);
            System.out.println(new String(str));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int n = sc.nextInt();
        reverseSeq(sc, n);
    }
}

