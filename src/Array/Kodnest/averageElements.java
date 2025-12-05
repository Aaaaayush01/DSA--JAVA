package Array.Kodnest;

import java.util.Scanner;

public class averageElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int sum =  0;
        int avg = 0;
        for (int i = 0; i < n; i++) {
            sum =  sum + arr[i];
            avg = sum / n;
        }
        System.out.println("The average of the elements in the array is: " + avg);
    }
}
