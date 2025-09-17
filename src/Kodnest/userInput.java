package Kodnest;

import java.util.Scanner;
public class userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        char name = sc.next().charAt(0); //to read only a character at the zero index i.e the first letter
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Enter your height (in meters)");
        Float height = sc.nextFloat();
        System.out.println("Enter your class");
        short standard = sc.nextShort();
        sc.nextLine();
        System.out.println("Enter your favourite colors");
        String color = sc.nextLine();
        System.out.println("Hi, " + name + "you're " + age + "years old. And " + height + "meters tall. Your favourite colors are: " + color );
    }
}
