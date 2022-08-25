package hexlet.code.games;

import static hexlet.code.Engine.getReferenceAnswer;
import static hexlet.code.Engine.getQuestionsAndAnswers;
import static hexlet.code.Engine.descriptionGame;
import static hexlet.code.Engine.GAME_EVEN_NAME;
import static hexlet.code.Engine.COUNT_OF_QUESTION;
import static hexlet.code.Engine.MULTIPLIER_TO_GET_INT;
import static hexlet.code.Engine.checkUserAnswers;
import static hexlet.code.Util.getRandNum;

public class GameEven {

    public static void playEvenGame() {
        String[][] questionsAnswers = new String[0][];
        String[] refAnswers = new String[0];

        descriptionGame(GAME_EVEN_NAME);

        for (int i = 0; i < COUNT_OF_QUESTION; i++) {
            int randNum = getRandNum(MULTIPLIER_TO_GET_INT);
            questionsAnswers = getQuestionsAnswers(randNum, i);
            refAnswers = getReferenceAnswers(randNum, i);
        }
        checkUserAnswers(questionsAnswers,refAnswers);
    }

    private static String[][] getQuestionsAnswers(int randNum, int i) {

        String[][] questionsAnswers = getQuestionsAndAnswers();
        String question = Integer.toString(randNum);
        questionsAnswers[0][i] = question;
        return questionsAnswers;
    }

    private static String[] getReferenceAnswers(int randNum, int i) {
        String[] referAnswers = getReferenceAnswer();
        int checkParity = randNum % 2;
        referAnswers[i] = checkParity == 0 ? "yes" : "no";
        return referAnswers;
    }
}
