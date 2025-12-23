package Array.Kodnest;

import java.util.Arrays;
import java.util.Scanner;

public class minMaxMerge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the first array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the first array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the second array: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter the elements of the second array: ");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] arr3 = new int[n + m];

        // Copy first array
        for (int i = 0; i < n; i++) {
            arr3[i] = arr[i];
        }

        // Copy second array
        for (int i = 0; i < m; i++) {
            arr3[n + i] = arr2[i];
        }
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
        System.out.println("Minimum Element: " + arr3[0]);
        System.out.println("Maximum Element: " + arr3[m + n - 1]);
    }
}
