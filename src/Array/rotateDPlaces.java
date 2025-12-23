package Array;

import java.util.Arrays;
import java.util.Scanner;

public class rotateDPlaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array: " + Arrays.toString(arr));

        System.out.print("Enter the number of elements to be rotated: ");
        int d = sc.nextInt();

        // Step 1: Reverse first d
        reverse(arr, 0, d - 1);

        // Step 2: Reverse remaining
        reverse(arr, d, size - 1);

        // Step 3: Reverse whole array
        reverse(arr, 0, size - 1);

        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
