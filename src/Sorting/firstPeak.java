package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class firstPeak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array: " + Arrays.toString(arr));
        if (arr[0] > arr[1]) {
            System.out.println("First Peak Element is: " + arr[0]);
            return;
        }

        // Check middle elements
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                System.out.println("First Peak Element is: " + arr[i]);
                return;
            }
        }

        // Check last element
        if (arr[n - 1] > arr[n - 2]) {
            System.out.println("First Peak Element is: " + arr[n - 1]);
            return;
        }

        System.out.println("No peak element found.");
    }
}
