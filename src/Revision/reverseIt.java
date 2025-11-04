package Revision;

import java.util.Scanner;

public class reverseIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int rev = 0;
        int dig = 0;
        while (num > 0) {
            dig = num % 10;
            rev = rev * 10 + dig;
            num = num / 10;
        }
        System.out.println("Reversed Number is " + rev);
    }
}
