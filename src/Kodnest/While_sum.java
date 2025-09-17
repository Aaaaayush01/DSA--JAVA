package Kodnest;

import java.util.Scanner;

public class While_sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int i = 0;
        int sum = 0;
        while (i <= num) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
