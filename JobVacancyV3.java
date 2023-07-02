import java.util.Scanner;

public class JobVacancyV3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan data diri
        System.out.print("Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Umur: ");
        int umur = scanner.nextInt();
        scanner.nextLine(); // Membaca karakter newline

        System.out.print("Lulusan (SMK/D3/S1): ");
        String lulusan = scanner.nextLine();

        System.out.print("Lama pengalaman (dalam tahun): ");
        int pengalaman = scanner.nextInt();

        System.out.print("Nilai penampilan (1-10): ");
        double penampilan = scanner.nextDouble();

        System.out.println("\nPosisi dan kriteria yang sesuai: ");
        System.out.println("===============================");

        // Pengecekan kriteria untuk Koordinator
        if (isKoordinatorKriteria1(umur, lulusan, pengalaman)) {
            System.out.println("Koordinator - Kriteria 1");
        }

        if (isKoordinatorKriteria2(umur, lulusan, pengalaman)) {
            System.out.println("Koordinator - Kriteria 2");
        }

        // Pengecekan kriteria untuk Admin
        if (isAdminKriteria1(umur, lulusan, penampilan, pengalaman)) {
            System.out.println("Admin - Kriteria 1");
        }

        if (isAdminKriteria2(umur, lulusan, penampilan, pengalaman)) {
            System.out.println("Admin - Kriteria 2");
        }

        if (isAdminKriteria3(umur, lulusan, penampilan, pengalaman)) {
            System.out.println("Admin - Kriteria 3");
        }

        // Pengecekan kriteria untuk SPV
        if (isSpvKriteria1(umur, lulusan, pengalaman)) {
            System.out.println("SPV - Kriteria 1");
        }

        if (isSpvKriteria2(umur, lulusan, pengalaman)) {
            System.out.println("SPV - Kriteria 2");
        }

        scanner.close();
    }

    // Metode untuk memeriksa kriteria Koordinator - Kriteria 1
    public static boolean isKoordinatorKriteria1(int umur, String lulusan, int pengalaman) {
        return (umur >= 21 && umur <= 30 && lulusan.equalsIgnoreCase("SMK/D3") && pengalaman >= 2);
    }

    // Metode untuk memeriksa kriteria Koordinator - Kriteria 2
    public static boolean isKoordinatorKriteria2(int umur, String lulusan, int pengalaman) {
        return (umur >= 30 && lulusan.equalsIgnoreCase("S1") && pengalaman >= 5);
    }

    // Metode untuk memeriksa kriteria Admin - Kriteria 1
    public static boolean isAdminKriteria1(int umur, String lulusan, double penampilan, int pengalaman) {
        return (umur >= 20 && umur <= 25 && lulusan.equalsIgnoreCase("D3") && (penampilan >= 8.5 || pengalaman >= 1));
    }

    // Metode untuk memeriksa kriteria Admin - Kriteria 2
    public static boolean isAdminKriteria2(int umur, String lulusan, double penampilan, int pengalaman) {
        return (umur > 25 && lulusan.equalsIgnoreCase("S1") && penampilan >= 8.5 && pengalaman >= 3);
    }

    // Metode untuk memeriksa kriteria Admin - Kriteria 3
    public static boolean isAdminKriteria3(int umur, String lulusan, double penampilan, int pengalaman) {
        return (umur >= 20 && umur <= 30 && penampilan >= 8.5 && (lulusan.equalsIgnoreCase("D3") || lulusan.equalsIgnoreCase("S1")) && pengalaman >= 2);
    }

    // Metode untuk memeriksa kriteria SPV - Kriteria 1
    public static boolean isSpvKriteria1(int umur, String lulusan, int pengalaman) {
        return ((umur >= 23 && umur <= 30) && lulusan.equalsIgnoreCase("S1") && pengalaman > 1);
    }

    // Metode untuk memeriksa kriteria SPV - Kriteria 2
    public static boolean isSpvKriteria2(int umur, String lulusan, int pengalaman) {
        return ((umur >= 25 && umur <= 35) && lulusan.equalsIgnoreCase("D3") && pengalaman > 4);
    }
}
