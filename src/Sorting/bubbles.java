package Sorting;

import java.util.Scanner;

public class bubbles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m =  sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] arr3 = new int[n + m];
        for (int i = 0; i < n; i++) {
            arr3[i] = arr[i];
        }
        for (int i = 0; i < m; i++) {
            arr3[n + i] = arr2[i];
        }
        bubbleSort(arr3);
        for (int i = 0; i < n + m; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
