package Kodnest;

public class While_nested {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 3){
            int j = 1;
            while(j <= 3){
                System.out.println("i = " + i + " j = " + j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
