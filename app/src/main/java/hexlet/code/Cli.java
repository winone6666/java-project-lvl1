package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static void greetingUser() {
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
