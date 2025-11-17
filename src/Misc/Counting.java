package Kodnest;

import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to countDigits: ");
        int num = input.nextInt();
        for (int i =1; i<= num; i++) {
            System.out.println(i);
        }
    }
}
