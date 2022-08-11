package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.greetingUser;
import static hexlet.code.Even.*;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit");
        int numOfGame = scanner.nextInt();
        System.out.println("Your choice: " + numOfGame);
        System.out.println("\nWelcome to the Brain Games!");

        switch (numOfGame) {
            case (1):
                greetingUser();
                break;
            case (2):
                printGreeting();
                playEvenGame();
                break;
            case (3):
                break;
        }
    }
}
