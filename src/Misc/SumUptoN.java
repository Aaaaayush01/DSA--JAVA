package Revision;

import java.util.Scanner;

public class SumUptoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i<=n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of first " + n + " Natural numbers is " + sum);
    }
}
