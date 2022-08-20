package hexlet.code.games;

import java.util.Arrays;
import static hexlet.code.Engine.COUNT_OF_QUESTION;
import static hexlet.code.Engine.questionsAndAnswers;
import static hexlet.code.Engine.getReferenceAnswer;
import static hexlet.code.Engine.compareUserAnswerAndReference;

public class GameProgression {
    public static final int LEN_PROGRESS_MIN = 5;
    public static final int LEN_PROGRESS_MAX = 10;
    public static final int START_NUM_MIN = 1;
    public static final int START_NUM_MAX = 50;
    public static final int D_MIN = 1;
    public static final int D_MAX = 10;

    public static void playProgressionGame() {
        String[] referAnswers = getReferenceAnswer();
        System.out.println("What number is missing in the progression?");

        for (int i = 0; i < COUNT_OF_QUESTION; i++) {

            int lengthProgression = (int) ((Math.random() * (LEN_PROGRESS_MAX - LEN_PROGRESS_MIN)) + LEN_PROGRESS_MIN);
            String[] progressionSeries = new String[lengthProgression];
            int startProgressionNum = (int) ((Math.random() * (START_NUM_MAX -  START_NUM_MIN)) + START_NUM_MIN);
            int d = (int) ((Math.random() * (D_MAX - D_MIN)) + D_MIN);
            progressionSeries[0] = Integer.toString(startProgressionNum);
            int indexOfHiddenNum = (int) (Math.random() * ((lengthProgression - 1) + 1));


            for (int j = 1; j < lengthProgression; j++) {
                progressionSeries[j] = Integer.toString(Integer.parseInt(progressionSeries[0]) + d * j);
            }
            referAnswers[i] = progressionSeries[indexOfHiddenNum];
            progressionSeries[indexOfHiddenNum] = "...";
            String question = String.join(" ", Arrays.toString(progressionSeries).split(", "));
            questionsAndAnswers[0][i] = question.substring(1, question.length() - 1);
        }
        compareUserAnswerAndReference();
    }
}
