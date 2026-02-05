package litCode;

import java.util.Scanner;

public class highestAltitude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(highestAltitude(arr));
    }
    public static int highestAltitude(int[] arr) {
        int total = 0;
        int peak = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
            if (peak < total) { // deployed this that
                peak = total;
                System.out.println("peak total");
            }
        }
        return peak;
    }
}
