package DSA;

import java.util.Scanner;

public class isArraySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i <= n-1; i++) {
            arr[i] = sc.nextInt();
        }

        boolean sorted = true;
        for (int i = 0; i <= n-2; i++){
            if (arr[i] > arr[i+1] ){
                sorted = false;
                break;
            }
        }
        if (sorted) {
            System.out.println("Sorted");
        }
        else  {
            System.out.println("Not Sorted");
        }
    }
}
