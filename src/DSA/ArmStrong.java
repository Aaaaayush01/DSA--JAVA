package DSA;

import javax.management.StringValueExp;
import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int n = sc.nextInt();
        int arm = 0;
        int size = String.valueOf(n).length();
        for (int i = 1; i <= size; i++) {
            arm = n%10;
            n = n/10;
        }
    }
}
