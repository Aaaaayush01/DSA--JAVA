package Kodnest;
import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        for(int a = 0; a < n; a++){
            for(int b = 0; b < 5; b++){
                System.out.println("A = " + a + " B = " + b);
            }
            System.out.println();
        }
    }
}
