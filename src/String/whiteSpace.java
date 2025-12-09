package String;

import java.util.Scanner;

public class whiteSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s = scanner.nextLine();
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == ' '){
                arr[i] = arr[i+1];
            }
            else{
                continue;
            }
        }
        s = new String(arr);
        System.out.println(s);
    }
}
