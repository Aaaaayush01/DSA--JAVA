package Array;

import java.util.Scanner;

public class dupliRemove {
    public static void main(String[] args) {
        /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements");
        for (int i = 0; i < arr.length; i++) {
             arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == arr[i + 1]) {
                    continue;
                }
                System.out.print(arr[i] + " ");
            }
            System.out.println(arr[size - 1]); // this works for sorted array but isnt the standard solution for this typa question (in-place) */
        /* Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]) {
                System.out.println(arr[i]);
            } else if (arr[i] == arr[i-1]) {
                continue;
            }
        } */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        if (arr.length == 0) {
            return;
        }

        int j = 1;  // write pointer

        for (int i = 1; i < size; i++) { // read pointer
            if (arr[i] != arr[j - 1]) {
                arr[j] = arr[i];
                j++;               // move write pointer
            }
        }

        // j is the new length (number of unique elements)
        System.out.println("New length: " + j);

        System.out.println("Unique elements:");
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}