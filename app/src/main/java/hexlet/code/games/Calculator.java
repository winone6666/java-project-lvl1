package hexlet.code.games;

import java.util.Scanner;

import static hexlet.code.Engine.*;
import static java.lang.Integer.parseInt;

public class Calculator {

    public static void playCalculatorgame() {

        String[] operators = {"-", "+", "*"};
        int referenceAnswer = 0;
        int randMultiplier1 = (int) (Math.random() * MULTIPLIER_TO_GET_INT);
        int randMultiplier2 = (int) (Math.random() * MULTIPLIER_TO_GET_INT);
        int randOperator = (int) (Math.random() * ((3 - 1) + 1));

        switch (operators[randOperator]) {
            case ("-") -> referenceAnswer = randMultiplier1 - randMultiplier2;
            case ("+") -> referenceAnswer = randMultiplier1 + randMultiplier2;
            case ("*") -> referenceAnswer = randMultiplier1 * randMultiplier2;
            default -> {
            }
        }
        String question = randMultiplier1 + " "
                + operators[randOperator] + " "
                + randMultiplier2;

        askQustion(question);
        compareUserAnswerWithReference(getUserAnswer(), Integer.toString(referenceAnswer), question);

    }
}