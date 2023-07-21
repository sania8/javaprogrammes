import java.util.Random;
import java.util.Scanner;

public class assign3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int userScore = 0;
        int computerScore = 0;

        System.out.println("Welcome to StickPickGame V3!");
        System.out.println("You can pick 1, 2, or 3 sticks in a turn.");
        System.out.println("The player with the lowest score wins.");

        while (true) {
            int sticksRemaining = random.nextInt(41) + 40; // Generate random number in [40, 80]

            System.out.println("\nStarting a new game with " + sticksRemaining + " sticks.");

            // Determine if computer should play first or second
            boolean computerPlaysFirst = random.nextBoolean();

            while (sticksRemaining > 0) {
                if (computerPlaysFirst) {
                    // Computer's turn
                    int computerPick = Math.min(3, sticksRemaining); // Computer always picks the minimum of 3 and the remaining sticks
                    computerScore += computerPick;
                    sticksRemaining -= computerPick;
                    System.out.println("Computer picks " + computerPick + " sticks.");
                    System.out.println("Sticks remaining: " + sticksRemaining);

                    if (sticksRemaining <= 0) {
                        break;
                    }
                }

                // User's turn
                System.out.print("Your turn. Enter the number of sticks you want to pick (1, 2, or 3): ");
                int userPick = scanner.nextInt();

                if (userPick < 1 || userPick > 3) {
                    System.out.println("Invalid input. You can only pick 1, 2, or 3 sticks.");
                    continue;
                }

                userScore += userPick;
                sticksRemaining -= userPick;
                System.out.println("Sticks remaining: " + sticksRemaining);

                // Computer's turn
                int computerPick = Math.min(3, sticksRemaining); // Computer always picks the minimum of 3 and the remaining sticks
                computerScore += computerPick;
                sticksRemaining -= computerPick;
                System.out.println("Computer picks " + computerPick + " sticks.");
                System.out.println("Sticks remaining: " + sticksRemaining);
            }

            // Determine the winner
            String winner;
            if (userScore < computerScore) {
                winner = "Computer";
            } else if (userScore > computerScore) {
                winner = "You";
            } else {
                winner = "It's a tie";
            }

            System.out.println("\nGame Over!");
            System.out.println("Your score: " + userScore);
            System.out.println("Computer score: " + computerScore);
            System.out.println(winner + " won!");

            System.out.print("Do you want to play again? (y/n): ");
            String playAgain = scanner.next();

            if (!playAgain.equalsIgnoreCase("y")) {
                System.out.println("Thanks for playing!");
                break;
            }

            // Reset scores for a new game
            userScore = 0;
            computerScore = 0;
        }

        scanner.close();
    }
}
