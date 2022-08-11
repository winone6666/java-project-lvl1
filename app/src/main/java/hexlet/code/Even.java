package hexlet.code;

import java.util.Scanner;

public class Even {
    static String userName;

    public static void printEvenGameDescription() {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
    }

    public static void printGreeting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
    }

    public static void playEvenGame() {
        printEvenGameDescription();
        int multiplierToGetInt = 100;
        Scanner scanner = new Scanner(System.in);
        int count = 3;

        while (count > 0) {
            int randNum = (int) (Math.random() * multiplierToGetInt);
            int checkParity = randNum % 2;
            String referenceAnswer;

            referenceAnswer = checkParity == 0 ? "yes" : "no";

            System.out.println("Question: " + randNum);
            String userAnswer = scanner.nextLine();
            System.out.println("Your answer: " + userAnswer);

            if (userAnswer.equals(referenceAnswer)) {
                System.out.println("Correct!");
                count--;
                if (count == 0) {
                    System.out.println("Congratulations, " + userName + "!");
                }
            } else {
                System.out.println("'" + userAnswer
                        +  "' is wrong answer ;(. Correct answer was '"
                        + referenceAnswer + "'.\n" + "Let's try again, "
                        + userName);
                break;
            }
        }
    }
}