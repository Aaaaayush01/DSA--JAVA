package Array;

import java.util.Scanner;

public class leftRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int temp = arr[0];
        for (int i = 1; i < 5; i++) {
            arr[i-1] = arr[i];
        }
        arr[4] = temp;
        System.out.println("After Rotating Array: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
