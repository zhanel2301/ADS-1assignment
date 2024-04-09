import java.util.Scanner;

public class Ninth {
    public static void allPermutations(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remainingChars = str.substring(0, i) + str.substring(i + 1);
            allPermutations(remainingChars, permutation + ch);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = scanner.nextLine();
        allPermutations(str, "");
    }
}

