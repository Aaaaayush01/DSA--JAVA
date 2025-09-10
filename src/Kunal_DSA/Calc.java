package Kunal_DSA;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = input.nextInt();
        System.out.println("Enter another number: ");
        int num2 = input.nextInt();
        System.out.println("Enter an operator: ");
        char operator = input.next().charAt(0);
        if (operator == '+') {
            System.out.println("Sum is: " + (num1 + num2));
        }
        else if (operator == '-') {
            System.out.println("Difference is: " + (num1 - num2));
        }
        else if (operator == '*') {
            System.out.println("Multiplication is: " + (num1 * num2));
        }
        else if (operator == '/') {
            System.out.println("Division is: " + (num1 / num2));
        }
        else {
            System.out.println("Invalid operator");
        }
    }
}
