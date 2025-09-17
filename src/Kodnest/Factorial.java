package Kodnest;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want the factorial of :");
        /* long num = sc.nextLong();
        long factorial = 1l;
        while (num > 0) {
            factorial = factorial * num;
            num--;
        }
        System.out.println(factorial); */
        int num = sc.nextInt();
        int i = 1;
        int factorial = 1;
        while (i <= num) {
            factorial = factorial * i;
            i++;
        }
        System.out.println(factorial);
    }
}
