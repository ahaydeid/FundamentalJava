import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        int targetScore = 50;
        int playerScore = 0;
        int computerScore = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (playerScore < targetScore && computerScore < targetScore) {
            // Giliran komputer
            int computerTurnScore = 0;
            for (int i = 0; i < 3; i++) {
                int diceRoll = random.nextInt(6) + 1;
                System.out.println("Komputer mengocok dadu: " + diceRoll);
                if (diceRoll == 1) {
                    System.out.println("Komputer mendapatkan angka 1. Giliran komputer berakhir.");
                    break;
                }
                computerTurnScore += diceRoll;
            }
            computerScore += computerTurnScore;
            System.out.println("Skor komputer: " + computerScore);

            // Giliran pemain
            int playerTurnScore = 0;
            System.out.print("Giliran Anda. Tekan enter untuk mengocok dadu: ");
            scanner.nextLine();
            int diceRoll = random.nextInt(6) + 1;
            System.out.println("Anda mengocok dadu: " + diceRoll);
            if (diceRoll == 1) {
                System.out.println("Anda mendapatkan angka 1. Giliran Anda berakhir.");
            } else {
                playerTurnScore += diceRoll;
                System.out.print("Apakah Anda ingin mengocok lagi? (y/t): ");
                String input = scanner.nextLine();
                while (input.equalsIgnoreCase("ya")) {
                    diceRoll = random.nextInt(6) + 1;
                    System.out.println("Anda mengocok dadu: " + diceRoll);
                    if (diceRoll == 1) {
                        System.out.println("Anda mendapatkan angka 1. Giliran Anda berakhir.");
                        break;
                    }
                    playerTurnScore += diceRoll;
                    System.out.print("Apakah Anda ingin mengocok lagi? (y/t): ");
                    input = scanner.nextLine();
                }
            }
            playerScore += playerTurnScore;
            System.out.println("Skor Anda: " + playerScore);
        }

        if (playerScore >= targetScore) {
            System.out.println("Anda menang!");
        } else {
            System.out.println("Komputer menang!");
        }
    }
}
