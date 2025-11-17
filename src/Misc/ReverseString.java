package DSA;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

        int n = str.length();

        char [] rev = new char[n];

        int j = rev.length - 1;
        for (int i = 0; i < n; i++) {
            rev[j] = str.charAt(i);
            j--;
        }
        System.out.println(rev);
    }
    /* public static void main(String[] args) {
        char[] arr = new char[4];
        arr[0] = 'A';
        arr[1] = 'B';
        arr[2] = 'C';
        arr[3] = 'D';

        char[] rev = new char[4];
        for (int i = 0; i <= 3; i++) {
            for (int j = 3; j <= 3; j--) {
                rev[i] = arr[j];
            }
        }
    } */
}
