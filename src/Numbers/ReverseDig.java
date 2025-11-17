package DSA;

import java.util.Scanner;

public class ReverseDig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = sc.nextInt();
        int rev = 0;
        while (n != 0) {
            int m = n % 10;
            rev = rev * 10 + m;
            n = n / 10;
        }
        System.out.println(rev);
    }
}
