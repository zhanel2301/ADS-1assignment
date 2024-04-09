import java.sql.SQLOutput;
import java.util.Scanner;

public class Fifth {
    public static void reverseSeq(Scanner sc, int n) {
        if (n == 0)
            return;
        else {
            System.out.println("Enter elements: ");
            int num = sc.nextInt();
            reverseSeq(sc, n - 1);
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a num: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverseSeq(sc, n);
    }
}
