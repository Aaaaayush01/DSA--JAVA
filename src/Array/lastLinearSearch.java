package Array;

import java.util.Scanner;

public class lastLinearSearch {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to search");
        int search = sc.nextInt();


        for (int i = 0; i < n; i++) {
            if (arr[i] == search) {
                System.out.println("Element found at index " + i + " ");
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == search) {
                System.out.println("Element found at first index " + i + " ");
                break;
            }
        }

        int last = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == search) {
                last = i;
            }
        }
        System.out.println("Element found at last index " + last + " ");
    }
}
