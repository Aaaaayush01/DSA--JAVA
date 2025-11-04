package Revision;

import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int count = 0;
        int num = 0;
        int m = n;
        while (m > 0) {
            num = m % 10;
            count++;
            m = m / 10;
        }
        System.out.println("Numbr of digits in " + n + " is " + count);
    }
}
