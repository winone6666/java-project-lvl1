package hexlet.code.games;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

import static hexlet.code.Engine.*;

public class GameProgression {

    public static void printProgressionGameDescription() {
        System.out.println("What number is missing in the progression?");
    }

    public static void playProgressionGame(){

        for (int i = 0; i < COUNT_OF_QUESTION; i++) {

            int lengthProgression = (int) ((Math.random() * (10 - 5)) + 5);
            String[] progressionSeries = new String [lengthProgression];
            int startProgressionNum = (int) ((Math.random() * (50 - 1)) + 1);
            int d = (int) ((Math.random() * (10 - 1)) + 1);
            progressionSeries[0] = Integer.toString(startProgressionNum);
            int indexOfHiddenNum = (int) (Math.random() * ((lengthProgression - 1) + 1));


            for(int j = 1; j < lengthProgression; j++){
                progressionSeries[j] = Integer.toString(Integer.parseInt(progressionSeries[0]) + d * j);

            }
            referenceAnswer[i] = progressionSeries[indexOfHiddenNum];
            progressionSeries[indexOfHiddenNum] = "...";
            String question = String.join(" ", Arrays.toString(progressionSeries).split(", "));
            questionsAndAnswers[0][i] = question.substring(1, question.length()-1);
        }
        compareUserAnswerAndReference(questionsAndAnswers, referenceAnswer);
    }
}