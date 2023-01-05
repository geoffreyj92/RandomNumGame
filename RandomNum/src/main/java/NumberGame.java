import org.example.RandomNumber;

import java.util.Scanner;

public class NumberGame {


    private int guess1;
    private int guess2;
    private int correctAnswer;
    private int randomNum;

    RandomNumber randomNumber = new RandomNumber();

    public int numberGuess() {

        Math.random();

        if (guess1 != correctAnswer) {
            System.out.println("Wrong answer, please guess again.");
        } else if (guess2 != correctAnswer) {
            System.out.println("Wrong guess again, game over!");
        }
        return correctAnswer;
    }

    public static void main(String[] args) {
        RandomNumber randomNumber1 = new RandomNumber();
        int num = randomNumber1.random();
        Scanner userInput = new Scanner(System.in);
        boolean running = true;

        System.out.println("Please enter a number between 1 and 50: ");
        System.out.println(userInput.nextLine());

        while(running) {

            if (userInput.equals(num)) {
                System.out.println("Your answer is correct!");
                break;
            } else {
                System.out.println("Your answer was wrong!");
                break;
            }

        }

        System.out.println("Please select another number between 1 and 50");
        System.out.println(userInput.nextLine());

        if (userInput.equals(num)) {
            System.out.println("Your answer is correct!");
        } else {
            System.out.println("Your answer was wrong! GAME OVER!!! The correct answer is " + num );
        }

    }
}
