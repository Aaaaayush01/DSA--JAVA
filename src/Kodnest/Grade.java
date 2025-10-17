package Kodnest;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Marks: ");
        int a = sc.nextInt();

        switch (a / 10) {
            case 10: // for 100
            case 9:  // 90–99
                System.out.println("A");
                break;
            case 8:  // 80–89
                System.out.println("B");
                break;
            default:
                System.out.println("C");
        }
    }
}