package Array;

import java.util.Arrays;

public class missingNumber {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[4] = 5;

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] + 1) != arr[i + 1]) {
                int num = (arr[i] + 1);
                System.out.println("The missing number is " + num);
                break;
            }
        }
    }
}
