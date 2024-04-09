import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a task to execute:");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                First.main(args);
                break;
            case 2:
                Second.main(args);
                break;
            case 3:
                Third.main(args);
                break;
            case 4:
                Fourth.main(args);
                break;
            case 5:
                Fifth.main(args);
                break;
            case 6:
                Sixth.main(args);
                break;
            case 7:
                Seventh.main(args);
                break;
            case 8:
                Eighth.main(args);
                break;
            case 9:
                Ninth.main(args);
                break;
            case 10:
                Tenth.main(args);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
