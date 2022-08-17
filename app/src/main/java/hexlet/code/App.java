package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.greetingUser;
import static hexlet.code.Engine.printGreeting;
import static hexlet.code.games.GameCalculator.playCalculatorgame;
import static hexlet.code.games.GameCalculator.printCalcGameDescription;
import static hexlet.code.games.GameEven.*;
import static hexlet.code.games.GameGCD.*;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n3 - Calculator\n4 - GCD\n0 - Exit");
        int numOfGame = scanner.nextInt();
        System.out.println("Your choice: " + numOfGame);
        System.out.println("\nWelcome to the Brain Games!");

        switch (numOfGame) {
            case (1) -> greetingUser();
            case (2) -> {
                printGreeting();
                printEvenGameDescription();
                playEvenGame();
            }
            case (3) -> {
                printGreeting();
                printCalcGameDescription();
                playCalculatorgame();
            }
            case (4) -> {
                printGreeting();
                printGCDGameDescription();
                playGCDGame();
            }
            default -> {
            }
        }
    }
}