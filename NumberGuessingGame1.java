
import java.util.*;

class NumberGuessingGame1 {
    public static void main(String[] args) {
        Random rnumber = new Random();
        int Random = rnumber.nextInt(100) + 1;
        int attempt = 6;
        int i = 1;
        boolean PlayAgain = true;
        Scanner scanner = new Scanner(System.in);
        
        while (PlayAgain) 
        {
            System.out.println("\t\t\t\t\t\t\t|| Welcome to Number Guessing Game || \n\t\t\t\t\t\t || Note: You Will Get Only 6 Chances to Guess ||"
                    + "\n\t\t---------------------------------------------------------------------------------------------------------------------");
            System.out.println("Enter the Number Between 1 to 100");

            for (i = 1; i <= attempt; i++) {
                System.out.print("---------------------------\n|| Attempt :" + i + "||" + "\n Enter your guess: ");
                int inputnumber = scanner.nextInt();
                
                if (inputnumber == Random) {
                    System.out.println("Congratulations! You Guessed the Correct Number");
                    break;
                } else if (inputnumber > Random) {
                    System.out.println("Your guess is too high. Try again:");
                } else {
                    System.out.println("Your guess is too low. Try again:");
                }
            }
            if (i == attempt + 1) {
                System.out.println("Sorry, you've run out of attempts! The correct number was " + Random + ".");
            }
            
            System.out.println("Do you Want to Play again? (yes/no)");
            String in = scanner.next();
            if (!in.equalsIgnoreCase("yes")) {
                PlayAgain = false;
            }
        }
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("----------------Thank you For playing GOOD BUY---------------------------");
        scanner.close();
    }
}


