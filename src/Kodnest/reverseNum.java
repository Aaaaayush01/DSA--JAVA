package Kodnest;

public class reverseNum {
    public static void main(String[] args) {
        int num = 12345;
        while (num != 0) {
            int rem = num % 10;
            num = num / 10;
            System.out.print(rem);
        }
    }
}
