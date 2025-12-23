package Array.Kodnest;

import java.util.Arrays;
import java.util.Scanner;

public class removeVal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the elements in the array: ");
        String arr = sc.nextLine();
        String[] arr2 = arr.trim().split("\\s+");
        int[] arr3 = new int[arr2.length];
        for (int i = 0; i < arr2.length; i++) {
            arr3[i] = Integer.parseInt(arr2[i]);
        }
        System.out.println("Enter the value to be removed: ");
        int val = sc.nextInt();
        int count = 0;
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] == val) {
                count++;
            }
        }
        int[] arr4 = new int[arr3.length-count];

        int j = 0; // The "Write" pointer for the new smaller array
        for (int i = 0; i < arr3.length; i++) { // The "Read" pointer for the original array
            if (arr3[i] != val) {
                arr4[j] = arr3[i]; // Put the kept value into the next available spot in arr4
                j++; // Move the write pointer forward
            }
        }
        System.out.println(Arrays.toString(arr4));
        System.out.println(arr4.length);
    }
}
