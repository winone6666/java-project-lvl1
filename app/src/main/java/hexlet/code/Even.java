package hexlet.code;
import java.util.Scanner;

public class Even {
    private static String userName;
    static final int MULTIPLIER_TO_GET_INT = 100;
    static int countOfQuestions = 3;

    public static void printEvenGameDescription() {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
    }
    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String name) {
        userName = name;
    }

    public static void printGreeting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        setUserName(scanner.nextLine());
        System.out.println("Hello, " + getUserName() + "!");
    }

    public static void playEvenGame() {
        printEvenGameDescription();
        Scanner scanner = new Scanner(System.in);

        while (countOfQuestions > 0) {
            int randNum = (int) (Math.random() * MULTIPLIER_TO_GET_INT);
            int checkParity = randNum % 2;
            String referenceAnswer;

            referenceAnswer = checkParity == 0 ? "yes" : "no";

            System.out.println("Question: " + randNum);
            String userAnswer = scanner.nextLine();
            System.out.println("Your answer: " + userAnswer);

            if (userAnswer.equals(referenceAnswer)) {
                System.out.println("Correct!");
                countOfQuestions--;
                if (countOfQuestions == 0) {
                    System.out.println("Congratulations, " + getUserName() + "!");
                }
            } else {
                System.out.println("'" + userAnswer
                        +  "' is wrong answer ;(. Correct answer was '"
                        + referenceAnswer + "'.\n" + "Let's try again, "
                        + getUserName());
                break;
            }
        }
    }
}