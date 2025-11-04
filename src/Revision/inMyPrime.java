package Revision;

import java.util.Scanner;

public class inMyPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i * i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime == true) {
            System.out.println("Prime number");
        }
        else  {
            System.out.println("Not Prime number");
        }
    }
}
