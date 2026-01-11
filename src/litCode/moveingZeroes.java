package litCode;

import java.util.Arrays;
import java.util.Scanner;

public class moveingZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
        }
        int[] arr2 = new int[t];
        for (int i = 0; i < t; i++) {
            if (arr[i] != 0) {
                arr2[i] = arr[i];
            } else {
                arr2[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
}
