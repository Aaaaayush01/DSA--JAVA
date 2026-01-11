package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class salMergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first array
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input second array
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Merge arrays
        int[] merged = new int[n1 + n2];

        for (int i = 0; i < n1; i++) {
            merged[i] = arr1[i];
        }

        for (int i = 0; i < n2; i++) {
            merged[n1 + i] = arr2[i];
        }

        // Output
        System.out.println("First Array:  " + Arrays.toString(arr1));
        System.out.println("Second Array: " + Arrays.toString(arr2));
        System.out.println("Merged Array,Before Sorting: " + Arrays.toString(merged));
        for (int i = 0; i < n1+n2; i++) {
            for (int j = i+1; j < n1+n2; j++) {
                if (merged[i] > merged[j]){
                    int temp = merged[i];
                    merged[i] = merged[j];
                    merged[j] = temp;
                }
            }
        }
        System.out.println("Merged Array,After Sorting: " + Arrays.toString(merged));
    }
}
