import java.util.*;
import java.util.Random;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int score=0;
        boolean playAgain;
        do {
            int targetNumber=random.nextInt(25)+1;
            int attempts=0;
            int maxAttempts=7;
            boolean guessedCorrectly=false;
            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I have picked a number between 1 and 25. You have "+maxAttempts+" attempts to guess it.");
            while ((attempts<maxAttempts)&&(!guessedCorrectly)) {
                System.out.print("Enter your guess: ");
                int guess=sc.nextInt();
                attempts++;
                if (guess==targetNumber) {
                    System.out.println("Congratulations! You guessed the number.");
                    guessedCorrectly=true;
                    score+=(maxAttempts-attempts+1);
                } else if (guess<targetNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }
            if (!guessedCorrectly) {
                System.out.println("Sorry! You've used all attempts. The correct number was "+targetNumber+".");
            }
            System.out.println("Your current score: "+score);
            System.out.print("Would you like to play again? (yes/no): ");
            playAgain=sc.next().equalsIgnoreCase("yes");
        } while (playAgain);
        System.out.println("Thank you for playing! Your final score: "+score);
        sc.close();
    }
}