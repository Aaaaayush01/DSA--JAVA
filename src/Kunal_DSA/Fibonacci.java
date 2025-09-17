package Kunal_DSA;

import java.util.Scanner;

/* public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms for fibonacci series: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print("Fibonacci series is: " + a + " " + b);
        for (int i = 2; i <= n; i++) {
            int sum = a + b;
            System.out.print(" " + sum);
            a = b;
            b = sum;
        }
    }
} */
/* self */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fibonacci term: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int term = 0;
        for (int i = 2; i <= n; i++) {
            term = a + b;
            a = b;
            b = term;
        }
        System.out.println("Your fibonacci term is " + term);
    }
}