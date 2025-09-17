package Kodnest;
import java.util.Scanner;
public class Positive {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        checkNum(a);
    }

    public static void checkNum(int number) {
        if (number < 0) {
            System.out.println("negative number");
        } else if (number > 0) {
            System.out.println("positive number");
        }
    }
}