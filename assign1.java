import java.util.Random;
import java.util.Scanner;

public class assign1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int userScore = 0;
        int computerScore = 0;

        System.out.println("Welcome to StickPickGame V1!");
        System.out.println("You can pick 1, 2, or 3 sticks in a turn.");
        System.out.println("The player with the lowest score wins.");

        while (true) {
            int sticksRemaining = random.nextInt(41) + 40; // Generate random number in [40, 80]

            System.out.println("\nStarting a new game with " + sticksRemaining + " sticks.");

            while (sticksRemaining > 0) {
                // User's turn
                System.out.print("Your turn. Enter the number of sticks you want to pick (1, 2, or 3): ");
                int userPick = scanner.nextInt();

                if (userPick < 1 || userPick > 3) {
                    System.out.println("Invalid input. You can only pick 1, 2, or 3 sticks.");
                    continue;
                }

                sticksRemaining -= userPick;
                System.out.println("Sticks remaining: " + sticksRemaining);

                if (sticksRemaining <= 0) {
                    System.out.println("Congratulations! You win!");
                    userScore += 5;
                    computerScore -= 5;
                    break;
                }

                // Computer's turn
                int computerPick = Math.min(sticksRemaining, random.nextInt(3) + 1); // Randomly pick 1, 2, or 3 sticks
                System.out.println("Computer picks " + computerPick + " sticks.");
                sticksRemaining -= computerPick;
                System.out.println("Sticks remaining: " + sticksRemaining);

                if (sticksRemaining <= 0) {
                    System.out.println("Oops! Computer wins!");
                    userScore -= 5;
                    computerScore += 5;
                    break;
                }
            }

            System.out.println("\nCurrent Scores:");
            System.out.println("Your score: " + userScore);
            System.out.println("Computer score: " + computerScore);

            System.out.print("Do you want to play again? (y/n): ");
            String playAgain = scanner.next();

            if (!playAgain.equalsIgnoreCase("y")) {
                System.out.println("Thanks for playing! Final scores:");
                System.out.println("Your score: " + userScore);
                System.out.println("Computer score: " + computerScore);
                break;
            }
        }

        scanner.close();
    }
}