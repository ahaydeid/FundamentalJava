import java.util.Random;
import java.util.Scanner;

public class TebakAngka {
    public static void main(String[] args) {
        Random random = new Random();
        int angkaAcak = random.nextInt(10) + 1;
        int kesempatan = 3;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < kesempatan; i++) {
            System.out.print("Masukkan angka tebakan (1-10): ");
            int angkaTebakan = scanner.nextInt();

            if (angkaTebakan == angkaAcak) {
                System.out.println("Yey, kamu menang!");
                break;
            } else if (Math.abs(angkaTebakan - angkaAcak) == 2) {
                System.out.println("Hangat");
            } else {
                System.out.println("Dingin");
            }
        }

        if (kesempatan == 0) {
            System.out.println("Kesempatan kamu habis");
        }

        scanner.close();
    }
}
