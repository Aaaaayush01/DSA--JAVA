package DSA;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.print("Enter any Operator: ");
        char operator = sc.next().charAt(0);
        if (operator == '+') {
            int result = a + b;
            System.out.println(a + " + " + b + " = " + result);
        }
        else if (operator == '-') {
            if (a>b) {
                int result = a - b;
                System.out.println(a + " - " + b + " = " + result);
            }
            else if (a<b) {
                int result = b - a;
                System.out.println(b + " - " + a + " = " + result);
            }
        }
        else if (operator == '*') {
            int result = a * b;
            System.out.println(a + " * " + b + " = " + result);
        }
        else if (operator == '/') {
            if (b == 0) {
                System.out.println("Cannot divide by zero");
            }
            else {
                int result = a / b;
                System.out.println(a + " / " + b + " = " + result);
            }
        }
        else {
            System.out.println("Invalid Operator");
        }
    }
}
