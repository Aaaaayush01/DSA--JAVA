package DSA;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num <= 1) {
            System.out.println("Not Prime Number");
        }
        for (int i = 2; i*i <= num; i++) {
            if (num%i==0) {
                System.out.println("Not Prime Number");
                return;
            }
        }
        System.out.println("Prime Number");
    }
}
