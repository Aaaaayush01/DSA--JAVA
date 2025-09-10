package Kunal_DSA;

import java.util.Scanner;

public class Simp_Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the yearly interest rate");
        double Rate = input.nextDouble();
        System.out.println("Enter the principal amount");
        double principal = input.nextDouble();
        System.out.println("Enter the time");
        double time = input.nextDouble();
        double result = (principal * Rate * time)/100 ;
        System.out.println("Your interest is: " + result);
    }
}
