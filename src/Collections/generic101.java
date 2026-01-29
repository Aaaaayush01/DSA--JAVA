package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class generic101 {
    public  static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = input.nextInt();
        input.nextLine();
        System.out.println("Enter the type of elements: ");
        String type = input.nextLine();

        if (type.equalsIgnoreCase("Integer")) {
            List<Integer> list = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                int  num1 = input.nextInt();
                list.add(num1);
            }
            System.out.println("Size: " + n);
            System.out.print("Elements: ");
                System.out.print(list);
        }
        else if (type.equalsIgnoreCase("Double")) {
            List<Double> list = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                double  num1 = input.nextDouble();
                list.add(num1);
            }
            System.out.println("Size: " + n);
            System.out.print("Elements: ");
            System.out.print(list);
        }
        else if (type.equalsIgnoreCase("String")) {
            List<String> list = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                String value = input.nextLine();
                list.add(value);
            }
            System.out.println("Size: " + n);
            System.out.print("Elements: ");
            System.out.print(list);
        }
    }
}
