package Revision;

import java.util.Scanner;

public class armWeak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int count = 0;
        int dig = 0;
        int rem = 0;
        while (num != 0) {
            dig = num % 10;
            int square = (int) Math.pow(dig, count);
            rem = rem*10 + dig;
            num = num / 10;
            count++;
            System.out.println(square);
        }
    }
}
