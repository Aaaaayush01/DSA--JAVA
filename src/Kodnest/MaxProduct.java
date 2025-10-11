package Kodnest;

public class MaxProduct {
    public static void main(String[] args) {
        int a [] = {2,3,-2,4};
        int n = a.length;
        int maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < n-1; i++) {
            int product = 1;
            for (int j = i; j <= n-1; j++) {
                product *= a[j];
                if (product > maxProduct) {
                    maxProduct = product;
                }
            }
        }
        System.out.println(maxProduct);
    }
}
