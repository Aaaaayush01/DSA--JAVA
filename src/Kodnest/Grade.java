* package Kodnest;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case (a >= 91 && a<= 100):
                System.out.println("A");
                break;
            case (a >= 81 && a<= 90):
                System.out.println("B");
                break;
            default:
                System.out.println("C");
        }
    }
}
/* package basics;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
 */