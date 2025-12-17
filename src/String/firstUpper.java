package String;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class firstUpper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        String result = toTitleCase(str);

        System.out.println("Original: " + str);
        System.out.println("Title Case: " + result);

        sc.close();
    }

    public static String toTitleCase(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        Pattern pattern = Pattern.compile("\\b\\p{javaLowerCase}");
        Matcher matcher = pattern.matcher(input);

        StringBuffer sb = new StringBuffer();

        while (matcher.find()) {
            matcher.appendReplacement(sb, matcher.group(0).toUpperCase());
        }

        matcher.appendTail(sb);

        return sb.toString();
    }
}
