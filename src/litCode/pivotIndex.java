package litCode;

import java.util.Scanner;

public class pivotIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of integers:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int pivot = pivotIndex(arr);
        System.out.println(pivot);
    }
    public static int pivotIndex(int[] arr) {
        int i  = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[i+1] == arr[j] + arr[j-1]) {
                return j-1;
            } else if (arr[i] + arr[i+1] < arr[j] + arr[j-1]) {
                i++;
            } else if (arr[i] + arr[i+1] > arr[j] + arr[j-1]) {
                j--;
            }
        }
        return -1;
    }
}
