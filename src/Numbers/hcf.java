package Revision;

import java.util.Scanner;

public class hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num = sc.nextInt();
        System.out.println("Enter 2nd number");
        int num1 = sc.nextInt();
        int i = 1;
        int hcf = 1;
        while (i <= num) {
            if (num % i == 0 && num1 % i == 0) {
                hcf = i;
            }
            i++;
        }
        System.out.println(hcf);
    }
}
