import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int userGuess = 0;
        boolean done = false;
        int val = rnd.nextInt(10) + 1;
        String trash;

        do {
            System.out.println("Guess the random number from 1 to 10: ");
            if(in.hasNextInt()) {
                userGuess = in.nextInt();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Please enter a valid number! (whole integer)");
            }
        } while(!done);

        if(userGuess == val) {
            System.out.println("You guessed correct! \nRandom Number: " + val + " \nYour Guess: " + userGuess);
        }
        else {
            System.out.println("You guessed incorrect! \nRandom Number: " + val + " \nYour Guess: " + userGuess);
        }
    }
}