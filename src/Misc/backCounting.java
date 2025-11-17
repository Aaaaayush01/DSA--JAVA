package Kodnest;

import java.util.Scanner;

public class backCounting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int i = sc.nextInt();
        do {
            System.out.println(i);
            i--;
        } while (i >= 1);
    }
}
