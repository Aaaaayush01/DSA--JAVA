package Misc;

import java.util.Scanner;

public class zeroesAtEnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < num; i++) {
            arr[i] = input.nextInt();
        }
        int next = 0;
        int count = 0;
        for (int i = 0; i < num; i++) {
            if (arr[i] != 0) {
                arr[next] = arr[i];
                next++;
                count++;
            }
        }
        for (int i = count; i < num; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
