package Misc;

import java.util.Scanner;

public class climbStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println(climbStairs(n));
    }
    public static int climbStairs(int n) {
        int steps = 0;
        if (n == 1) return n;
        if (n % 2 == 0) {
            steps = n / 2;
        }
        else {
            steps = n / 2 + 1;
        }
        return steps;
    }
}
