package Kodnest;

import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd: " + i);
            }
            else if (i % 2 == 0) {
                System.out.println("Even: " + i);
            }
            }
        }
    }

