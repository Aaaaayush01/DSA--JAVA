package Array.Kodnest;

import java.util.Arrays;
import java.util.Scanner;

public class transposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter the elements of the matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int [][] temp = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                 temp[j][i] = arr[i][j];
            }
        }
        System.out.println("Original matrix: " + Arrays.deepToString(arr));
        System.out.println("Transposed matrix: " + Arrays.deepToString(temp));
    }
}
