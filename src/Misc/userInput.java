package Kodnest;

import java.util.Scanner;
public class userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Enter your height (in meters)");
        Float height = sc.nextFloat();
        System.out.println("Enter your class");
        short standard = sc.nextShort();
        sc.nextLine();
        System.out.println("Enter your favourite colors");
        String color = sc.nextLine();
        System.out.println("Hi," + name + "you're " + age + "years old. And " + height + "meters tall. Your favourite colors are: " + color );
    }
}
