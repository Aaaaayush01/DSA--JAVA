package Array;

import java.util.Arrays;

public class zeroesAtEnd {
    public  static void main(String[] args) {
        int arr[] = new int[8];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 0;
        arr[3] = 0;
        arr[4] = 5;
        arr[5] = 0;
        arr[6] = 1;
        arr[7] = 0;

        int size = arr.length;

        System.out.println(Arrays.toString(arr));

        /* int arr1[] = new int[size];

        int j = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] != 0) {
                arr1[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arr1));
        System.out.print("Number of non zero elements in array is: " + j); */
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
