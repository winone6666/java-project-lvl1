package hexlet.code.games;

import static hexlet.code.Engine.MULTIPLIER_TO_GET_INT;
import static hexlet.code.Engine.COUNT_OF_QUESTION;
import static hexlet.code.Engine.*;

public class Even {

    public static void printEvenGameDescription() {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
    }

    public static void playEvenGame() {

        String[][] questionsAndAnswers = new String[2][3];
        String[] referenceAnswer = new String[3];

        for (int i = 0; i < COUNT_OF_QUESTION; i++) {
            int randNum = (int) (Math.random() * MULTIPLIER_TO_GET_INT);
            String question = Integer.toString(randNum);
            questionsAndAnswers[0][i] = question;
            int checkParity = randNum % 2;
            referenceAnswer[i] = checkParity == 0 ? "yes" : "no";
        }

        compareUserAnswerAndReference(questionsAndAnswers, referenceAnswer);
    }
}