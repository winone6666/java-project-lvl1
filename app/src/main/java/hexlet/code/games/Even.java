package hexlet.code.games;
import java.util.Scanner;

import static hexlet.code.Engine.MULTIPLIER_TO_GET_INT;
import static hexlet.code.Engine.COUNT_OF_QUESTION;
import static hexlet.code.Engine.*;

public class Even {

    public static void printEvenGameDescription() {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
    }

    public static void playEvenGame() {

        int countOfQuestions = 3;
        int randNum = (int) (Math.random() * MULTIPLIER_TO_GET_INT);
        int checkParity = randNum % 2;
        String referenceAnswer;
        referenceAnswer = checkParity == 0 ? "yes" : "no";
        String exp = Integer.toString(randNum);

        compareUserAnswerWithReference(getUserAnswer(), referenceAnswer, exp);
    }
}