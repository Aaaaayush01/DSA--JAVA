package litCode;

import java.util.Arrays;
import java.util.Scanner;

public class removeElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be removed:");
        int val = sc.nextInt();
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != val) {
                arr[k] = arr[i];
                k++;
            }
        }
        System.out.println("Removed " + k + " from the array");
        System.out.println(Arrays.toString(arr));
    }
}
