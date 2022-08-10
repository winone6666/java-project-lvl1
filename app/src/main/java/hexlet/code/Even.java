package hexlet.code;

import java.util.Scanner;
import java.lang.Math;

public class Even {
    static String userName;

    public static void printGameDescription() {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
    }

    public static void printGreeting(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
    public static int generateRand() {
        return (int) (Math.random() * 100);
    }
    public static void checkParyOfRandNum(){

        Scanner scanner = new Scanner(System.in);
        int count = 3;

        while(count > 0) {
            int randNum = generateRand();

            System.out.println("Question: " + randNum);
            int checkParity = randNum % 2;
            String userAnswer = scanner.nextLine();
            System.out.println("Your answer: " + userAnswer);
            if((checkParity == 0 && userAnswer.equals("yes")) || (checkParity == 1 && userAnswer.equals("no"))){
                System.out.println("Correct!");
                count--;
            }
            else {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n" + "Let's try again, " + userName);
                count = 3;
            }
        }
        System.out.println("Congratulations, " + userName);

    }
}
