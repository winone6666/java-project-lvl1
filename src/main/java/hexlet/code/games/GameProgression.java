package hexlet.code.games;

import java.util.Arrays;

import static hexlet.code.Engine.*;
import static hexlet.code.Util.getRandNum;

public class GameProgression {
    public static final int LEN_PROGRESS_MIN = 5;
    public static final int LEN_PROGRESS_MAX = 10;
    public static final int START_NUM_MIN = 1;
    public static final int START_NUM_MAX = 50;
    public static final int D_MIN = 1;
    public static final int D_MAX = 10;

    public static void playProgressionGame() {
        String[] referAnswers = getReferenceAnswer();
        String[][] questionsAnswers = getQuestionsAndAnswers();
        System.out.println("What number is missing in the progression?");

        for (int i = 0; i < COUNT_OF_QUESTION; i++) {

            int lengthProgression = getRandNum((LEN_PROGRESS_MAX - LEN_PROGRESS_MIN) + LEN_PROGRESS_MIN);
            int d = getRandNum((D_MAX - D_MIN) + D_MIN);
            int startProgressionNum = getRandNum((START_NUM_MAX -  START_NUM_MIN) + START_NUM_MIN);
            String[] progression = generateProgression(d,lengthProgression, startProgressionNum);

            int indexOfHiddenNum = (int) (Math.random() * ((lengthProgression - 1) + 1));
            referAnswers[i] = progression[indexOfHiddenNum];
            progression[indexOfHiddenNum] = "..";
            String question = String.join(" ", Arrays.toString(progression).split(", "));
            questionsAnswers[0][i] = question.substring(1, question.length() - 1);
        }
        checkUserAnswers();
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
