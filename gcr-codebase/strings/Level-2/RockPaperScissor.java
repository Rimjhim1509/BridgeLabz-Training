import java.util.*;
public class RockPaperScissor {
	
	public static int getComputerChoice() {
        return (int) (Math.random() * 3); // 0, 1, or 2
    }

    // Method to find winner
    public static String findWinner(int player, int computer) {

        if (player == computer) {
            return "Draw";
        }

        if ((player == 0 && computer == 2) ||
            (player == 1 && computer == 0) ||
            (player == 2 && computer == 1)) {
            return "Player Wins";
        }

        return "Computer Wins";
    }
	public static String[][] calculateStats(int playerWins, int computerWins, int totalGames) {

        String[][] stats = new String[2][3];

        double playerPercent = (playerWins * 100.0) / totalGames;
        double computerPercent = (computerWins * 100.0) / totalGames;

        stats[0][0] = "Player";
        stats[0][1] = String.valueOf(playerWins);
        stats[0][2] = String.format("%.2f", playerPercent) + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", computerPercent) + "%";

        return stats;
    }
   
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
	   int playerWins = 0 ,computerWins = 0 ,draws = 0;
	   String[][] gameResults = new String[n][4];
	    for (int i = 0; i < n; i++) {

            System.out.println("\nGame " + (i + 1));
            System.out.println("Enter your choice (0-Rock, 1-Paper, 2-Scissors): ");
            int playerChoice = sc.nextInt();

            int computerChoice = getComputerChoice();
            String result = findWinner(playerChoice, computerChoice);

            if (result.equals("Player Wins")) {
                playerWins++;
            } else if (result.equals("Computer Wins")) {
                computerWins++;
            }

            gameResults[i][0] = String.valueOf(i + 1);
            gameResults[i][1] = choiceToString(playerChoice);
            gameResults[i][2] = choiceToString(computerChoice);
            gameResults[i][3] = result;
        }

        String[][] stats = calculateStats(playerWins, computerWins, n);

        sc.close();
    }

   
    public static String choiceToString(int choice) {
        if (choice == 0) return "Rock";
        if (choice == 1) return "Paper";
        return "Scissors";
    }
}

    }
}