package Misc;

import java.util.Arrays;
import java.util.Scanner;

public class maxEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        majorityElement(arr);
    }
    public static int majorityElement(int[] nums) {
        int count = 1;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
                if (count >= (n / 2)) {
                    System.out.println(nums[i]);
                }
            }
        }
        return count;
    }
}
