package DSA;

import java.util.Scanner;

public class ArrayQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements in the array: ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element you want to search for: ");
        int search = sc.nextInt();

        for (int i = 0; i <= size; i++) {
            if (arr[i] == search) {
                System.out.println("Element found at index: " + i);
                break;
            }
        }
    }
}