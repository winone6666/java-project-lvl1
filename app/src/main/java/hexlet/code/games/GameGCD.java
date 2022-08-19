package hexlet.code.games;

import static hexlet.code.Engine.COUNT_OF_QUESTION;
import static hexlet.code.Engine.MULTIPLIER_TO_GET_INT;
import static hexlet.code.Engine.questionsAndAnswers;
import static hexlet.code.Engine.referenceAnswer;
import static hexlet.code.Engine.compareUserAnswerAndReference;

public class GameGCD {

    public static void playGCDGame() {
        System.out.println("Find the greatest common divisor of given numbers.");

        for (int i = 0; i < COUNT_OF_QUESTION; i++) {

            int numFirst = (int) (Math.random() * MULTIPLIER_TO_GET_INT);
            int numSecond = (int) (Math.random() * MULTIPLIER_TO_GET_INT);

            String nFirst = Integer.toString(numFirst);
            String nSecond = Integer.toString(numSecond);
            String question = nFirst + " " + nSecond;

            questionsAndAnswers[0][i] = question;

            while (numSecond != 0) {
                int temp = numFirst % numSecond;
                numFirst = numSecond;
                numSecond = temp;
            }
            referenceAnswer[i] = Integer.toString(numFirst);
        }
        compareUserAnswerAndReference(questionsAndAnswers, referenceAnswer);
    }
}
