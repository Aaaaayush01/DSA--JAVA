package Array;

import java.util.Scanner;

public class freakquency {
    public static void main(String[] args) {
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
    }
}
