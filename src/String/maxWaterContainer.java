package String;

import java.util.Scanner;

public class maxWaterContainer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The maximum water in the array is: " + maxWater(arr));
    }
        public static int maxWater(int[] arr){
            int maxWater = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    int height = Math.min(arr[i], arr[j]);
                    int width = j - i;
                    int area = height * width;
                    if (area > maxWater) {
                        maxWater = area;
                    }
                }
            }
            return maxWater;
    }
}
