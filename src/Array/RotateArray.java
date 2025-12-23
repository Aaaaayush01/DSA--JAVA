import java.util.Scanner;
public class RotateArray{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Take input
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter array elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Right rotation by one
            int last = arr[n - 1];   // store last element
            for (int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1]; // shift elements right
            }
            arr[0] = last; // put last element at first position

            // Print result
            System.out.print("Array after right rotation: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
