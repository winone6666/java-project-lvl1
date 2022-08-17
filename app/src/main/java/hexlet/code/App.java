package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.greetingUser;
import static hexlet.code.Engine.printGreeting;
import static hexlet.code.games.GameCalculator.playCalculatorgame;
import static hexlet.code.games.GameCalculator.printCalcGameDescription;
import static hexlet.code.games.GameEven.*;
import static hexlet.code.games.GameGCD.*;
import static hexlet.code.games.GameProgression.printProgressionGameDescription;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calculator
                4 - GCD
                5 - Progression
                0 - Exit
                """);

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
            case (5) -> {
                printGreeting();
                printProgressionGameDescription();
                playProgressionGame();
            }
            default -> {
            }
        }
    }

    private static void playProgressionGame() {
    }
}