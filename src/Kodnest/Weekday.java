package basics;
import  java.util.Scanner;
public class Weekday {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the day of week: ");
        int day = input.nextInt();
        if (day >= 1 && day <= 5) {
            System.out.println("Weekday");
        }
        else if (day >= 6 && day <= 7) {
            System.out.println("Weekend");
        }
        else {
            System.out.println("Invalid day");
        }
    }
}
