import java.util.Random; // (Random) Helps generate a random number.
import java.util.Scanner;// (Scanner) Allows user input.

class GuessMyNumberGame {
    public static void main(String args[]) {
        int guess, random;
        Scanner sc = new Scanner(System.in);//We create a Scanner to take user input.
        Random ran = new Random();//We create a Random object to generate a random number between 1 and 100.

        random = ran.nextInt(101); // Generates a number between 0 and 100
        
        System.out.println("Guess My Number (1 to 100)");
        
        for (int i = 0; i < 3; i++) //The player gets 3 chances, so we use a loop (for loop runs 3 times).
        {
            System.out.print("Enter your Guess: ");//The game asks the player to enter a number.
            guess = sc.nextInt();
            
            if (guess == random) {
                System.out.println("You Win! 🎉");//If the guess matches the random number, the player wins!
                System.out.println("The Number was " + random);//The return statement ends the game immediately.
                break; // Exit loop when guessed correctly
            } 
            else if (random - 5 < guess && random + 5 > guess) // (Math.abs(random - guess) <= 5) checks if the guess is within 5 numbers of the correct answer.
            {
                System.out.println("So Close! to guess number 🔥 Try again.");//If the player is close, the game gives a "So Close!" message.
            } 
            else if (guess > random) 
            {
                System.out.println("Think Smaller ⬇️");////If the guess is too high, the game says "Think Smaller!"
            } 
            else {
                System.out.println("Think Bigger ⬆️");//If the guess is too low, the game says "Think Bigger!"
            }

            if (i == 2) { // If last attempt is reached
                System.out.println("You Lost! 😞 The correct number was " + random);
            }
        }
        
        sc.close(); // Close Scanner
    }
}
