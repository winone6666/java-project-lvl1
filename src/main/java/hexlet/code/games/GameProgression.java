package hexlet.code.games;

import java.util.Arrays;

import static hexlet.code.Engine.getReferenceAnswer;
import static hexlet.code.Engine.getQuestionsAndAnswers;
import static hexlet.code.Engine.descriptionGame;
import static hexlet.code.Engine.GAME_PROGRESS_NAME;
import static hexlet.code.Engine.COUNT_OF_QUESTION;
import static hexlet.code.Engine.checkUserAnswers;
import static hexlet.code.Util.getRandNum;

public class GameProgression {
    public static final int LEN_PROGRESS_MIN = 5;
    public static final int LEN_PROGRESS_MAX = 11;
    public static final int START_NUM_MIN = 1;
    public static final int START_NUM_MAX = 51;
    public static final int D_MIN = 1;
    public static final int D_MAX = 11;

    public static void playProgressionGame() {
        String[] referAnswers = getReferenceAnswer();
        String[][] questionsAnswers = getQuestionsAndAnswers();
        descriptionGame(GAME_PROGRESS_NAME);

        for (int i = 0; i < COUNT_OF_QUESTION; i++) {

            int lengthProgression = LEN_PROGRESS_MIN + getRandNum(LEN_PROGRESS_MAX - LEN_PROGRESS_MIN);
            int d = D_MIN + getRandNum(D_MAX - D_MIN);
            int startProgressionNum = START_NUM_MIN + getRandNum(START_NUM_MAX - START_NUM_MIN);
            String[] progression = generateProgression(d, lengthProgression, startProgressionNum);

            int indexOfHiddenNum = 1 + getRandNum(lengthProgression - 1);

            referAnswers = getReferenceAnswers(progression, indexOfHiddenNum, i);
            progression[indexOfHiddenNum] = "..";
            questionsAnswers = getQuestionsAnswers(progression, i);

        }
        checkUserAnswers(questionsAnswers, referAnswers);
    }

    private static String[][] getQuestionsAnswers(String[] progression, int i) {
        String[][] questionsAnswers = getQuestionsAndAnswers();
        String question = String.join(" ", Arrays.toString(progression).split(", "));
        questionsAnswers[0][i] = question.substring(1, question.length() - 1);
        return questionsAnswers;
    }

    private static String[] getReferenceAnswers(String[] progression, int hidSymbol, int i) {
        String[] referAnswers = getReferenceAnswer();
        referAnswers[i] = progression[hidSymbol];
        return referAnswers;
    }

    public static String[] generateProgression(int d, int lengthProgression, int startProgressionNum) {
        String[] progressionSeries = new String[lengthProgression];
        progressionSeries[0] = Integer.toString(startProgressionNum);
        for (int j = 1; j < lengthProgression; j++) {
            progressionSeries[j] = Integer.toString(Integer.parseInt(progressionSeries[0]) + d * j);
        }
        return progressionSeries;
    }
}
