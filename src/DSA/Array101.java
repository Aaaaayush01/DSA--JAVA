package DSA;

import java.util.Arrays;

public class Array101 {
    public  static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = 10;
        nums[1] = 2;
        nums[2] = 30;
        nums[3] = 4;
        nums[4] = 50;
        Arrays.sort(nums);
        System.out.println("Sorted Array: " + Arrays.toString(nums));
        int element = Arrays.binarySearch(nums, 50);
        System.out.println("50 is present at " + element + " position");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
