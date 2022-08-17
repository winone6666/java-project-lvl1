package hexlet.code;

import java.util.Scanner;


public class Engine {
    public static final int MULTIPLIER_TO_GET_INT = 100;
    public static final int COUNT_OF_QUESTION = 3;
    private static String userName;
    public static String[][] questionsAndAnswers = new String[2][3];
    public static String[] referenceAnswer = new String[3];
    public static String userAnswer;
    public static String refAnswer;


    public static String getUserAnswer() {
        Scanner scanner = new Scanner(System.in);
        String userAnswer = scanner.nextLine();
        return userAnswer;
    }

    public static void askQustion (String expression) {
        System.out.println("Question: " + expression);
    }

    public static void compareUserAnswerAndReference(String[][] questionsAndAnswers, String[] referenceAnswer) {

        for (int i = COUNT_OF_QUESTION; i > 0; i--) {

            askQustion(questionsAndAnswers[0][i-1]);
            questionsAndAnswers[1][i-1] = getUserAnswer();
            userAnswer = questionsAndAnswers[1][i-1];
            System.out.println("Your answer: " + userAnswer);
            refAnswer = referenceAnswer[i-1];

            if (userAnswer.equals(refAnswer)) {
                System.out.println("Correct!");
                if (i == 1) {
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