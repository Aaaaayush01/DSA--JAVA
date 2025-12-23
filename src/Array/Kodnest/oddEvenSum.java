package Array.Kodnest;

import java.util.Scanner;

public class oddEvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenSum += arr[i];
            }
            else {
                oddSum += arr[i];
            }
        }
        System.out.println("Sum of Even numbers in the array: " + evenSum);
        System.out.println("Sum of Odd numbers in the array: " + oddSum);
    }
}
