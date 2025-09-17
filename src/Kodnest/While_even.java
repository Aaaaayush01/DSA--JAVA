package Kodnest;

import java.util.Scanner;

public class While_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int i = 0;
        while (i <= num) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            }
            else  {
                System.out.println(i + " is odd");
            }
            i++;
        }
    }
}
