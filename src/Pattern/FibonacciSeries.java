package DSA;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int temp = a+b;
            a = b;
            b = temp;
        }
    }
}
