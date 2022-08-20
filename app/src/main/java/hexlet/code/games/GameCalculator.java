package hexlet.code.games;

import static hexlet.code.Engine.COUNT_OF_QUESTION;
import static hexlet.code.Engine.MULTIPLIER_TO_GET_INT;
import static hexlet.code.Engine.getReferenceAnswer;
import static hexlet.code.Engine.getQuestionsAndAnswers;
import static hexlet.code.Engine.compareUserAnswerAndReference;

public class GameCalculator {
    public static final int MIN_COUNT_OPERANDS = 1;
    public static final int MAX_COUNT_OPERANDS = 3;

    public static void playCalculatorgame() {

        String[] referAnswers = getReferenceAnswer();
        String[][] questionsAnswers = getQuestionsAndAnswers();

        System.out.println("What is the result of the expression?");

        for (int i = 0; i < COUNT_OF_QUESTION; i++) {

            String[] operators = {"-", "+", "*"};

            int randMultFirst = (int) (Math.random() * MULTIPLIER_TO_GET_INT);
            int randMultSecond = (int) (Math.random() * MULTIPLIER_TO_GET_INT);

            int randOperator = (int) (Math.random() * ((MAX_COUNT_OPERANDS - MIN_COUNT_OPERANDS) + MIN_COUNT_OPERANDS));
            switch (operators[randOperator]) {
                case ("-") -> referAnswers[i] = Integer.toString(randMultFirst - randMultSecond);
                case ("+") -> referAnswers[i] = Integer.toString(randMultFirst + randMultSecond);
                case ("*") -> referAnswers[i] = Integer.toString(randMultFirst * randMultSecond);
                default -> {
                }
            }
            String question = randMultFirst + " "
                    + operators[randOperator] + " "
                    + randMultSecond;

            questionsAnswers[0][i] = question;
        }
        compareUserAnswerAndReference();
    }
}
