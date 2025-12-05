package Array;

import java.util.Arrays;
import java.util.Scanner;

public class unionSorted {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the first array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the first array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the size of the second array: ");
        int m = sc.nextInt();
        int arr1[] = new int[m];
        System.out.println("Enter the elements of the second array: ");
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("1st Array : " + Arrays.toString(arr));
        System.out.println("2nd Array : " + Arrays.toString(arr1));


    }
}
