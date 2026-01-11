package litCode;

import java.util.Scanner;

public class searchInsert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target value: ");
        int target = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.println("Target: " + arr[i] + " found at index: " + i);
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > target) {
                arr[i-1] = target;
            }
        }
    }
}
