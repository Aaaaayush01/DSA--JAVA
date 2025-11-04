package Kodnest;

import java.util.Scanner;

public class reverseNum {
/*     public static void main(String[] args) {
        int num = 12345;
        while (num != 0) {
            int rem = num % 10;
            num = num / 10;
            System.out.print(rem);
        }
    }
} */






















    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        System.out.println(rev);
    }

}