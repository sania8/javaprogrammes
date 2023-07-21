import java.util.Random;
import java.util.Scanner;

public class assign2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int userScore = 0;
        int computerScore = 0;

        System.out.println("Welcome to StickPickGame V2!");
        System.out.println("You can pick a variable number of sticks in a turn.");
        System.out.println("The player with the lowest score wins.");

        while (true) {
            int sticksRemaining = random.nextInt(5) + 3; // Generate random number in [3, 7]

            System.out.println("\nStarting a new game with " + sticksRemaining + " sticks.");

            int turn = 1;
            while (sticksRemaining > 0) {
                int maxPick = Math.min(5 + turn, sticksRemaining); // Determine the maximum number of sticks the player can pick
                System.out.print("Turn " + turn + ": Your turn. Enter the number of sticks you want to pick (1-" + maxPick + "): ");
                int userPick = scanner.nextInt();

                if (userPick < 1 || userPick > maxPick) {
                    System.out.println("Invalid input. You can only pick 1-" + maxPick + " sticks.");
                    continue;
                }

                sticksRemaining -= userPick;
                System.out.println("Sticks remaining: " + sticksRemaining);

                if (sticksRemaining <= 0) {
                    System.out.println("Congratulations! You win!");
                    userScore += 5;
                    System.out.println("your score is :" + userScore);
                    computerScore -= 5;
                    break;
                }

                // Computer's turn
                int computerPick = Math.min(maxPick, Math.min(random.nextInt(5) + 1, sticksRemaining)); // Randomly pick 1-5 sticks or maxPick, whichever is smaller, but not more than sticksRemaining
                System.out.println("Turn " + turn + ": Computer picks " + computerPick + " sticks.");
                sticksRemaining -= computerPick;
                System.out.println("Sticks remaining: " + sticksRemaining);

                if (sticksRemaining <= 0) {
                    System.out.println("Oops! Computer wins!");
                    userScore -= 5; // Decrease userScore by 5
                    computerScore += 5; // Increase computerScore by 5
                    break;
                }


                turn++;
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
