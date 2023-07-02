import java.util.Scanner;

public class PassingGradeSMK79 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai matematika: ");
        int mathScore = scanner.nextInt();

        System.out.print("Masukkan nilai bahasa Indonesia: ");
        int indonesianScore = scanner.nextInt();

        System.out.print("Masukkan nilai bahasa Inggris: ");
        int englishScore = scanner.nextInt();

        System.out.print("Masukkan nilai IPA: ");
        int scienceScore = scanner.nextInt();

        double averageScore = (mathScore + indonesianScore + englishScore + scienceScore) / 4.0;
        boolean isAccepted = averageScore >= 73;

        boolean isAcceptedInLiterature = indonesianScore >= 75 && englishScore >= 75;
        boolean isAcceptedInComputerScience = mathScore >= 80;

        System.out.println("Kamu diterima masuk di SMK Padepokan 79: " + isAccepted);
        System.out.println("Kamu diterima di jurusan Sastra: " + isAcceptedInLiterature);
        System.out.println("Kamu diterima di jurusan Teknik Komputer Jaringan: " + isAcceptedInComputerScience);

        scanner.close();
    }
}
