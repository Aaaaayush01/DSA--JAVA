package Kunal_DSA;

import java.util.Scanner;

/* public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter third number");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("Largest Number: " + a);
        }
        else if(b>a && b>c){
            System.out.println("Largest Number: " + b);
        }
        else {
            System.out.println("Largest Number: " + c);
        }
    }
} */

public class IsLargest {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter third number: ");
        int num3 = sc.nextInt();

        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
                max = num3;
        }
        System.out.println("Largest Number: " + max);
    }
}