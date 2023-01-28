// Rugved Belkundkar
import java.util.*;
import java.lang.Math;

public class GuessingGame {
    public static void main(String[] args) {
      
        // generate a random number between 1 and 100
        int answer = (int) (Math.random() * 100) + 1;
        // number of trials that the user has to guess the number
        int k = 10;
        // create a scanner object to read user input
        Scanner input = new Scanner(System.in);
		// checking the user has guessed the number
        boolean correct = false;
        System. out.print("\nI'm Thinking a Number Between 1 and 100.\n\nYou Have 5 Tries to Guess the Number\n");
        while (k > 0) {
            System. out.print("\n\nEnter your guessed NO : ");
            int guess = input.nextInt();
            // if the user guesses number correctly then print the message and exit the program
            if (guess == answer) {
                System. out.print("\nYou Guessed The Number!\nYou Won!");
                break;
            }
            // if the user guesses greater than the number, print the message and reduce the number of
            // trials
            else if (guess > answer) {
                System.out.print("\nYour Guess Is Too High.\nYou Have " + (k - 1) + " Tries Left.");
                k--;
            }
            // if the user guesses less than the number, print the message and reduce the number of
            // trials
            else {
                System.out.print("\nYour Guess Is Too Low.\nYou Have " + (k - 1) + " Tries Left.");
            }
            // after each trial decrease the number of trials by 1
            k--;
        }
    // if the user has run out of trials then print the message and exit.

		if (correct==false) {
        System.out.print("\n\nYou Ran Out of Tries.\nYou lost!");
    }
    }
}
// Rugved Belkundkar