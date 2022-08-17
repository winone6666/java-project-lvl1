package hexlet.code.games;

import static hexlet.code.Engine.*;

public class Calculator {
    public static final int MIN_COUNT_OPERANDS = 1;
    public static final int MAX_COUNT_OPERANDS = 3;

    public static void printCalcGameDescription() {
        System.out.println("What is the result of the expression?");
    }

    public static void playCalculatorgame() {

        for (int i = 0; i < COUNT_OF_QUESTION; i++) {

            String[] operators = {"-", "+", "*"};

            int randMultFirst = (int) (Math.random() * MULTIPLIER_TO_GET_INT);
            int randMultSecond = (int) (Math.random() * MULTIPLIER_TO_GET_INT);

            int randOperator = (int) (Math.random() * ((MAX_COUNT_OPERANDS - MIN_COUNT_OPERANDS) + MIN_COUNT_OPERANDS));
            switch (operators[randOperator]) {
                case ("-") -> referenceAnswer[i] = Integer.toString(randMultFirst - randMultSecond);
                case ("+") -> referenceAnswer[i] = Integer.toString(randMultFirst + randMultSecond);
                case ("*") -> referenceAnswer[i] = Integer.toString(randMultFirst * randMultSecond);
                default -> {
                }
            }
            String question = randMultFirst + " "
                    + operators[randOperator] + " "
                    + randMultSecond;

            questionsAndAnswers[0][i] = question;
        }
       compareUserAnswerAndReference(questionsAndAnswers, referenceAnswer);
    }
}