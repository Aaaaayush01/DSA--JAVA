package Array;

public class leftRotate {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        System.out.println("Original Array: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int temp = arr[0];
        for (int i = 1; i < 5; i++) {
            arr[i-1] = arr[i];
        }
        arr[4] = temp;
        System.out.println("After Rotating Array: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
