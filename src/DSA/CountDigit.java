package DSA;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            int m = n % 10;
            n /= 10;
                if (m == 1) {
                    count++;
                }
        }
        System.out.println(count);
    }
}
/*        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        int count = 0;
        for(int i = 0; num > 0; i++){
            int m = num % 10;
            if (m == 1){
                count++;
                num = num / 10;
            }
            else if (m != 1){
                break;
            }
            System.out.println(count);
        }
    }
} */
