// Number Game 
// In this the user is to guess the number repeatdly until user it right 
// Return the number of guess that user used to guess it 
import java.util.Random;
import java.util.Scanner;
public class NumberGame {
    public static void main(String[] args) {
        int answer, guess;
        final int max = 100;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        boolean playAgain = true;
        int guessCount = 0;

        while (playAgain) {
            answer = rand.nextInt(max) + 1;
            System.out.println("Guess a number between 1 and 100");
            guessCount = 0;

            while (true) {
                guess = sc.nextInt();
                guessCount++;
                if (guess == answer) {
                    System.out.println("Good job, the number was " + answer);
                    System.out.println("You took " + guessCount + " guesses.");
                    break;
                } else if (guess < answer) {
                    System.out.println("Try a higher number.");
                } else {
                    System.out.println("Try a lower number.");
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainResponse = sc.next().toLowerCase();

            if (!playAgainResponse.equals("yes")) {
                playAgain = false;
            }
        }
    }
}
