package hexlet.code.games;

import static hexlet.code.Engine.getReferenceAnswer;
import static hexlet.code.Engine.getQuestionsAndAnswers;
import static hexlet.code.Engine.descriptionGame;
import static hexlet.code.Engine.GAME_CALC_NAME;
import static hexlet.code.Engine.MULTIPLIER_TO_GET_INT;
import static hexlet.code.Engine.COUNT_OF_QUESTION;
import static hexlet.code.Engine.checkUserAnswers;
import static hexlet.code.Util.getRandNum;

public class GameCalculator {
    private static final int MIN_COUNT_OPERANDS = 1;
    private static final int MAX_COUNT_OPERANDS = 3;

    public static void playCalculatorgame() {

        String[][] questionsAnswers = new String[0][];
        String[] refAnswers = new String[0];

        descriptionGame(GAME_CALC_NAME);

        for (int i = 0; i < COUNT_OF_QUESTION; i++) {
            String randOperator = getOperator();
            int randMultFirst = getRandNum(MULTIPLIER_TO_GET_INT);
            int randMultSecond = getRandNum(MULTIPLIER_TO_GET_INT);
            questionsAnswers = getQuestionsAnswers(randMultFirst, randMultSecond, randOperator, i);
            refAnswers = getReferenceAnswers(randMultFirst, randMultSecond, randOperator, i);
        }
        checkUserAnswers(questionsAnswers,refAnswers);
    }

    private static String[][] getQuestionsAnswers(int num1, int num2, String operator, int i) {

        String[][] questionsAnswers = getQuestionsAndAnswers();
        String question = num1 + " "
                + operator + " "
                + num2;
        questionsAnswers[0][i] = question;
        return questionsAnswers;
    }

    private static String[] getReferenceAnswers(int num1, int num2, String operator, int i) {
        String[] referAnswers = getReferenceAnswer();
        referAnswers[i] = Integer.toString(getRightAnswer(operator, num1, num2));
        return referAnswers;
    }

    private static String getOperator() {
        String[] operators = {"-", "+", "*"};
        int randOperator = getRandNum((MAX_COUNT_OPERANDS - MIN_COUNT_OPERANDS) + MIN_COUNT_OPERANDS);
        return operators[randOperator];
    }

    private static int getRightAnswer(String operator, int multFirst, int multSecond) {
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
