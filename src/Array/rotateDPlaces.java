package Array;

import java.util.Arrays;
import java.util.Scanner;

public class rotateDPlaces {
    public static void main(String[] args) {
        /* int arr[] = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        arr[7] = 8;
        arr[8] = 9;
        arr[9] = 10;

        int size = arr.length;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to rotate: ");
        int n = input.nextInt();

        int arr1[] = new int[n];  // storing first n values in temporary array
        for (int i = 0; i < n; i++) {
            arr1[i] = arr[i];
        }
        for (int i = n; i < size; i++) {
            arr[i-n] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            arr[size-n+i] = arr1[i];
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        } */

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
