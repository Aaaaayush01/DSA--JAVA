package Array;

import java.util.Arrays;
import java.util.Scanner;

public class freakquency {
    /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array are: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean[] flag = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (flag[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                    flag[j] = true;
                }
            }
            System.out.println(arr[i] + " " + count);
        }
        sc.close();
    } */























    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            int count = 1;
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue; // Skip already counted elements
            }
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                } else {
                    break; // No need to continue once a different element is found
                }
            }
            System.out.println(arr[i] + " " + count);
        }
    }
}

























