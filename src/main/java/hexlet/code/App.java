package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.greetingUser;
import static hexlet.code.Engine.printGreeting;
import static hexlet.code.games.GameEven.playEvenGame;
import static hexlet.code.games.GameCalculator.playCalculatorgame;
import static hexlet.code.games.GameGCD.playGCDGame;
import static hexlet.code.games.GamePrime.playPrimeGame;
import static hexlet.code.games.GameProgression.playProgressionGame;

public class App {
    private static final int EXIT = 0;
    private static final int GREET = 1;
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calculator
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                """);

        int numOfGame = scanner.nextInt();
        System.out.println("Your choice: " + numOfGame);

        switch (numOfGame) {
            case GREET -> greetingUser();
            case EVEN -> {
                printGreeting();
                playEvenGame();
            }
            case CALC -> {
                printGreeting();
                playCalculatorgame();
            }
            case GCD -> {
                printGreeting();
                playGCDGame();
            }
            case PROGRESSION -> {
                printGreeting();
                playProgressionGame();
            }
            case PRIME -> {
                printGreeting();
                playPrimeGame();
            }
            case EXIT -> System.out.println("Bye-bye!");
            default -> System.out.println("Unexpected number: " + numOfGame + ". "
                        + "Please select game again.");
        }
    }
}
