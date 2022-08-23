package hexlet.code;

import java.util.Scanner;


public class Engine {
    public static final int MULTIPLIER_TO_GET_INT = 100;
    public static final int COUNT_OF_QUESTION = 3;
    public static final int COUNT_OF_PAIR_QUESTIONS_ANSWERS = 2;
    private static String userName;
    private static final String[][] QUESTIONS_ANSWERS = new String[COUNT_OF_PAIR_QUESTIONS_ANSWERS][COUNT_OF_QUESTION];
    private static final String[] REFERENCE_ANSWERS = new String[COUNT_OF_QUESTION];
    private static String userAnswer;
    private static String refAnswer;

    public static String[] getReferenceAnswer() {
        return REFERENCE_ANSWERS;
    }

    public static String[][] getQuestionsAndAnswers() {
        return QUESTIONS_ANSWERS;
    }

    private static String getUserAnswer() {
        Scanner scanner = new Scanner(System.in);
        userAnswer = scanner.nextLine();
        return userAnswer;
    }

    private static void askQustion(String expression) {
        System.out.println("Question: " + expression);
    }

    public static void checkUserAnswers() {

        for (int i = COUNT_OF_QUESTION; i > 0; i--) {
            askQustion(QUESTIONS_ANSWERS[0][i - 1]);
            QUESTIONS_ANSWERS[1][i - 1] = getUserAnswer();
            userAnswer = QUESTIONS_ANSWERS[1][i - 1];
            System.out.println("Your answer: " + userAnswer);
            refAnswer = REFERENCE_ANSWERS[i - 1];

            if (userAnswer.equals(refAnswer)) {
                System.out.println("Correct!");
                if (i == 1) {
                    System.out.println("Congratulations, " + getUserName() + "!");
                }
            } else {
                printUserMistake();
                break;
            }
        }
    }

    private static void printUserMistake() {
        System.out.println("'" + userAnswer
                +  "' is wrong answer ;(. Correct answer was '"
                + refAnswer + "'.\n" + "Let's try again, "
                + getUserName() + "!");
    }

    public static String getUserName() {
        return userName;
    }

    private static void setUserName(String name) {
        userName = name;
    }

    public static void printGreeting() {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        setUserName(scanner.nextLine());
        System.out.println("Hello, " + getUserName() + "!");
    }
}
