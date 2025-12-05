package Array.Kodnest;

import java.util.Arrays;
import java.util.Scanner;

public class minimum2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns of the array: ");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter the elements of the array - ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int min1 = arr[i][0];
            for (int j = 1; j < m; j++) {
                if (arr[i][j] < min1) {
                    min1 = arr[i][j];
                }
            }
            sum += min1;
        }
        /* int min2 = arr[1][0];
        for (int j = 0; j < n; j++) {
            if (arr[1][j] < min2) {
                min2 = arr[0][j];
            }
        }
        int min3 = arr[2][0];
        for (int j = 0; j < n; j++) {
            if (arr[2][j] < min3) {
                min3 = arr[0][j];
            }
        }
        int sum = min1 + min2 + min3; */
        System.out.println("The sum of minimum elements of each row is : " + sum);
    }
}
