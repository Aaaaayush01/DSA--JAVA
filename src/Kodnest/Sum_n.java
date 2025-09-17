package Kodnest;

import java.util.Scanner;

public class Sum_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number you want to add upto: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            /*System.out.println(sum);  this prints every sum until 55 */
        }
        System.out.println("Final Sum: " + sum);
    }
}
