package Revision;

import java.util.Scanner;

public class NumberTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first no.");
        int num = input.nextInt();
        int x = 1;
        for (int i = 0; i < num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print(x + " ");
            }
            x = x + 1;
            System.out.println();
        }
    }
}
