import java.util.Scanner;
public class Main {

    public static void main(String args[]) {
        Scanner input = new Scanner (System.in);
        String question = "Do you like La Tiao";
        String choiceOne = "yesss";
        String choiceTwo = "noooo";
        String choiceThree = "i can try";

        String correctAnswer = choiceOne;

        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statement giving the answer choices
        System.out.println(choiceOne);
        System.out.println(choiceTwo);
        System.out.println(choiceThree);
        // Have the user input an answer
        // Retrieve the user's input
        String userInput = input.next();

        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.
        if (correctAnswer.equals(userInput.toLowerCase())) {
            System.out.println("Congrats");
        } else {
            System.out.println("Sorry you are missing out");
        }

        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.

    }

}
