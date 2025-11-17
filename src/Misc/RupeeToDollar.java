package DSA;
import java.util.Scanner;

public class RupeeToDollar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount in rupees: ");
        double num1 = sc.nextDouble();
        double usd = num1 / 88.06 ;
        System.out.println(num1 + " Rupees in dollars is: " + usd + "$");
    }
}
