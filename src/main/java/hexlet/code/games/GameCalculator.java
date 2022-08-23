package hexlet.code.games;

import static hexlet.code.Engine.COUNT_OF_QUESTION;
import static hexlet.code.Engine.MULTIPLIER_TO_GET_INT;
import static hexlet.code.Engine.getReferenceAnswer;
import static hexlet.code.Engine.getQuestionsAndAnswers;
import static hexlet.code.Engine.checkUserAnswers;
import static hexlet.code.Util.getRandNum;

public class GameCalculator {
    public static final int MIN_COUNT_OPERANDS = 1;
    public static final int MAX_COUNT_OPERANDS = 3;

    public static void playCalculatorgame() {
        String[][] questionsAnswers = getQuestionsAndAnswers();
        String[] referAnswers = getReferenceAnswer();

        System.out.println("What is the result of the expression?");

        for (int i = 0; i < COUNT_OF_QUESTION; i++) {
            String randOperator = getOperator();
            int randMultFirst = getRandNum(MULTIPLIER_TO_GET_INT);
            int randMultSecond = getRandNum(MULTIPLIER_TO_GET_INT);

            String question = randMultFirst + " "
                    + randOperator + " "
                    + randMultSecond;

            questionsAnswers[0][i] = question;

            referAnswers[i] = Integer.toString(getRightAnswer(randOperator, randMultFirst, randMultSecond));
        }
        checkUserAnswers();
    }

    public static String getOperator() {
        String[] operators = {"-", "+", "*"};
        int randOperator = getRandNum((MAX_COUNT_OPERANDS - MIN_COUNT_OPERANDS) + MIN_COUNT_OPERANDS);
        return operators[randOperator];
    }

    public static int getRightAnswer(String operator, int multFirst, int multSecond) {
        int rightAnswer = 0;

        if (operator.equals("-")) {
            rightAnswer = multFirst - multSecond;
        }
        if (operator.equals("+")) {
            rightAnswer = multFirst + multSecond;
        }
        if (operator.equals("*")) {
            rightAnswer = multFirst * multSecond;
        }

        return rightAnswer;
    }
}
