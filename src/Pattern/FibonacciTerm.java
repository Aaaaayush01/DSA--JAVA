package DSA;

import java.util.Scanner;

/* public class FibonacciTerm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms for climbStairs series: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print("FibonacciTerm series is: " + a + " " + b);
        for (int i = 2; i <= n; i++) {
            int sum = a + b;
            System.out.print(" " + sum);
            a = b;
            b = sum;
        }
    }
} */
/* self */
public class FibonacciTerm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the climbStairs term: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int term = 0;
        for (int i = 2; i <= n; i++) {
            term = a + b;
            a = b;
            b = term;
        }
        System.out.println("Your climbStairs term is " + term);
    }
}