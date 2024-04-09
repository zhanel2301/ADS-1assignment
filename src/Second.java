import java.util.Scanner;

public class Second {
    public static int sumOfArray(int[] arr, int n) {
        if (n <= 0)
            return 0;
        else
            return arr[n - 1] + sumOfArray(arr, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        int res = sumOfArray(arr, n);
        System.out.println("The sum of the first " + n + " elements of the array: " + res);
    }
}
