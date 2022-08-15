package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Engine.askQustion;

public class Engine {
    public static final int MULTIPLIER_TO_GET_INT = 100;
    public static final int COUNT_OF_QUESTION = 3;
    private static String userName;


    public static String getUserAnswer() {
        Scanner scanner = new Scanner(System.in);
        String userAnswer = scanner.nextLine();
        return userAnswer;
    }

    public static void askQustion (String expression) {
        System.out.println("Question: " + expression);
    }

    public static void compareUserAnswerWithReference(String userAnswer, String refAnswer, String question) {
        int countOfQuestions = COUNT_OF_QUESTION;

        while (countOfQuestions > 0) {
            System.out.println("Your answer: " + userAnswer);
            askQustion(question);
            getUserAnswer();

            if (userAnswer.equals(refAnswer)) {
                System.out.println("Correct!");
                countOfQuestions--;

                if (countOfQuestions == 0) {
                    System.out.println("Congratulations, " + getUserName() + "!");
                }

            } else {
                printUserMistake(userAnswer, refAnswer);
                break;
            }
        }
    }

    public static void printUserMistake(String userAnswer, String referenceAnswer) {
        System.out.println("'" + userAnswer
                +  "' is wrong answer ;(. Correct answer was '"
                + referenceAnswer + "'.\n" + "Let's try again, "
                + getUserName());
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
}