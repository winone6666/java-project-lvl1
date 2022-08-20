package hexlet.code.games;

import static hexlet.code.Engine.COUNT_OF_QUESTION;
import static hexlet.code.Engine.MULTIPLIER_TO_GET_INT;
import static hexlet.code.Engine.questionsAndAnswers;
import static hexlet.code.Engine.referenceAnswer;
import static hexlet.code.Engine.compareUserAnswerAndReference;

public class GamePrime {

    public static void playPrimeGame() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int temp;
        boolean isPrime = true;
        for (int i = 0; i < COUNT_OF_QUESTION; i++) {

            int randNum = (int) (Math.random() * MULTIPLIER_TO_GET_INT);
            String question = Integer.toString(randNum);
            questionsAndAnswers[0][i] = question;

            for (int j = 2; j <= randNum / 2; j++) {
                temp = randNum % j;
                if (temp == 0) {
                    isPrime = false;
                    break;
                }
            }
            referenceAnswer[i] = isPrime ? "yes" : "no";
        }
        compareUserAnswerAndReference();
    }
}
