import java.util.Scanner;
import java.util.Arrays;

public class _2104412_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input:");
        String inputLine = sc.nextLine();

        String[] inputArray = inputLine.split(",");
        int n = inputArray.length;
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(inputArray[i]);
            a[i] = x;
        }
        // Sorting of the array using bubble sort technique
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int k = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = k;
                }
            }
        }

        System.out.print("Output:");
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print(a[i]);
            } else {
                System.out.print(a[i] + ",");
            }
        }

        sc.close();
    }
}
