package hexlet.code.games;

import static hexlet.code.Engine.getReferenceAnswer;
import static hexlet.code.Engine.getQuestionsAndAnswers;
import static hexlet.code.Engine.descriptionGame;
import static hexlet.code.Engine.GAME_GCD_NAME;
import static hexlet.code.Engine.MULTIPLIER_TO_GET_INT;
import static hexlet.code.Engine.COUNT_OF_QUESTION;
import static hexlet.code.Engine.checkUserAnswers;
import static hexlet.code.Util.getRandNum;

public class GameGCD {

    public static void playGCDGame() {
        String[] referAnswers = getReferenceAnswer();
        String[][] questionsAnswers = getQuestionsAndAnswers();
        descriptionGame(GAME_GCD_NAME);

        for (int i = 0; i < COUNT_OF_QUESTION; i++) {

            int numFirst = getRandNum(MULTIPLIER_TO_GET_INT);
            int numSecond = getRandNum(MULTIPLIER_TO_GET_INT);
            String nFirst = Integer.toString(numFirst);
            String nSecond = Integer.toString(numSecond);
            String question = nFirst + " " + nSecond;
            questionsAnswers[0][i] = question;

            while (numSecond != 0) {
                int temp = numFirst % numSecond;
                numFirst = numSecond;
                numSecond = temp;
            }
            referAnswers[i] = Integer.toString(numFirst);
        }
        checkUserAnswers();
    }
}
