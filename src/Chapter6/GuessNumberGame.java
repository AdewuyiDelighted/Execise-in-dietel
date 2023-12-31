package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessNumberGame {


    public static void guessGame() {
        int stopper = 0;
        while (stopper != -1) {
            Scanner scanner = new Scanner(System.in);
            SecureRandom secureRandom = new SecureRandom();
            System.out.println("Enter a number between 1 and 1000");
            int answer = scanner.nextInt();
            int randomAnswer = secureRandom.nextInt(5);
            while (answer != randomAnswer) {
                if (answer > randomAnswer) {
                    System.out.println("Answer too high(Try again)");
                    answer = scanner.nextInt();
                }
                if (answer < randomAnswer) {
                    System.out.println("Answer too low(Try again)");
                    answer = scanner.nextInt();
                }
                if (answer == randomAnswer) {
                    System.out.println("Congratulation");
                }
            }
            System.out.println("Enter 1 to continue or -1 to stop");
            stopper = scanner.nextInt();


        }
    }
}
