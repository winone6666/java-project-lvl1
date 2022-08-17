package hexlet.code.games;

import static hexlet.code.Engine.*;

public class Calculator {

    public static void playCalculatorgame() {
        String[][] questionsAndAnswers = new String[2][3];
        String[] referenceAnswer = new String[3];

        for (int i = 0; i < COUNT_OF_QUESTION; i++) {

            String[] operators = {"-", "+", "*"};
            int randMultFirst = (int) (Math.random() * MULTIPLIER_TO_GET_INT);
            int randMultSecond = (int) (Math.random() * MULTIPLIER_TO_GET_INT);
            int randOperator = (int) (Math.random() * ((3 - 1) + 1));

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