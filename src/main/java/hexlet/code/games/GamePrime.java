package hexlet.code.games;

import java.math.BigInteger;

import static hexlet.code.Engine.*;
import static hexlet.code.Util.getRandNum;

public class GamePrime {

    public static void playPrimeGame() {
        String[] referAnswers = getReferenceAnswer();
        String[][] questionsAnswers = getQuestionsAndAnswers();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        for (int i = 0; i < COUNT_OF_QUESTION; i++) {

            int randNum = getRandNum(MULTIPLIER_TO_GET_INT);
            String question = Integer.toString(randNum);
            questionsAnswers[0][i] = question;
            referAnswers[i] = (isPrime(randNum)) ? "yes" : "no";

        }
        checkUserAnswers();
    }

    private static boolean isPrime(int primeNumber) {
        BigInteger bigInteger = BigInteger.valueOf(primeNumber);
        return bigInteger.isProbablePrime((int) Math.log(primeNumber));
    }
}
