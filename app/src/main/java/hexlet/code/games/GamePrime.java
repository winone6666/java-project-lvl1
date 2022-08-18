package hexlet.code.games;

import static hexlet.code.Engine.*;

public class GamePrime {

    public static void printPrimeGameDescription() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    public static void playPrimeGame(){
        int temp;
        boolean isPrime = true;
        for (int i = 0; i < COUNT_OF_QUESTION; i++) {

            int randNum = (int) (Math.random() * MULTIPLIER_TO_GET_INT);
            String question = Integer.toString(randNum);
            questionsAndAnswers[0][i] = question;

            for (int j = 2; j<=randNum/2; j++) {
                temp = randNum % j;
                if (temp == 0) {
                    isPrime = false;
                    break;
                }
            }
            referenceAnswer[i] = isPrime? "yes" : "no";

        }
        compareUserAnswerAndReference(questionsAndAnswers, referenceAnswer);
    }
    }