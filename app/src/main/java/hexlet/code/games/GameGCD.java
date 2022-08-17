package hexlet.code.games;

import static hexlet.code.Engine.*;

public class GameGCD {

    public static void printGCDGameDescription() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    static int numFirst = (int) (Math.random() * MULTIPLIER_TO_GET_INT);
    static int numSecond = (int) (Math.random() * MULTIPLIER_TO_GET_INT);

    public static void playGCDGame() {

        for (int i = COUNT_OF_QUESTION; i > 0; i--) {

            String nFirst = Integer.toString(numFirst);
            String nSecond = Integer.toString(numSecond);
            String question = nFirst + nSecond;

            questionsAndAnswers[0][i] = question;

            while (numSecond != 0) {
                int temp = numFirst % numSecond;
                numFirst = numSecond;
                numSecond = temp;
                referenceAnswer[i] = Integer.toString(numFirst);
            }
        }
        }
}