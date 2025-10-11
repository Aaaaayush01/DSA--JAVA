package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int a[] = new int[5];
       /* a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50; */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements");
        int n = sc.nextInt();
        for (int i = 0; i < a.length-1; i++) {
            a[i] = sc.nextInt();
        }
        /* System.out.println("Array Values: " + Arrays.toString(a)); */
        /* System.out.println(a[0] + " / " + a[1] + " / " + a[2] + " / " + a[3] + " / " + a[4]); */
        for(int i = 0; i < a.length-1; i++) {
            System.out.println(a[i]);
        }
    }
}
