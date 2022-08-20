package hexlet.code.games;

import static hexlet.code.Engine.COUNT_OF_QUESTION;
import static hexlet.code.Engine.MULTIPLIER_TO_GET_INT;
import static hexlet.code.Engine.questionsAndAnswers;
import static hexlet.code.Engine.getReferenceAnswer;
import static hexlet.code.Engine.compareUserAnswerAndReference;

public class GameEven {

    public static void playEvenGame() {
        String[] referAnswers = getReferenceAnswer();
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");

        for (int i = 0; i < COUNT_OF_QUESTION; i++) {

            int randNum = (int) (Math.random() * MULTIPLIER_TO_GET_INT);
            String question = Integer.toString(randNum);
            questionsAndAnswers[0][i] = question;
            int checkParity = randNum % 2;
            referAnswers[i] = checkParity == 0 ? "yes" : "no";

        }
        compareUserAnswerAndReference();
    }
}
