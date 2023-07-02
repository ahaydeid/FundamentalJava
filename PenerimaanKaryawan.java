import java.util.Scanner;

public class PenerimaanKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan gender (Pria/Wanita): ");
        String gender = input.nextLine();

        System.out.print("Masukkan usia: ");
        int usia = input.nextInt();

        System.out.print("Masukkan lulusan (SMK/D3/S1): ");
        String lulusan = input.next();

        System.out.print("Masukkan lama pengalaman kerja (dalam tahun): ");
        int pengalamanKerja = input.nextInt();

        System.out.print("Masukkan nilai penampilan: ");
        double penampilan = input.nextDouble();

        System.out.println("\nHasil seleksi:");
        System.out.println("==============");

        // Koordinator
        if (gender.equalsIgnoreCase("Pria")) {
            if ((usia >= 21 && usia <= 30) && (lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3")) && (pengalamanKerja >= 2)) {
                System.out.println("Posisi: Koordinator (Kriteria 1)");
            } else if (usia >= 30 && lulusan.equalsIgnoreCase("S1") && pengalamanKerja >= 5) {
                System.out.println("Posisi: Koordinator (Kriteria 2)");
            }
        }

        // Admin
        if (gender.equalsIgnoreCase("Wanita")) {
            if ((usia >= 20 && usia <= 25) && lulusan.equalsIgnoreCase("D3") && (penampilan >= 8.5 || pengalamanKerja >= 1)) {
                System.out.println("Posisi: Admin (Kriteria 1)");
            }
        }

        if (gender.equalsIgnoreCase("Pria")) {
            if ((usia >= 25) && lulusan.equalsIgnoreCase("S1") && penampilan >= 8.5 && pengalamanKerja >= 3) {
                System.out.println("Posisi: Admin (Kriteria 2)");
            } else if ((usia >= 20 && usia <= 30) && (penampilan >= 8.5) && (lulusan.equalsIgnoreCase("D3") || lulusan.equalsIgnoreCase("S1")) && pengalamanKerja >= 2) {
                System.out.println("Posisi: Admin (Kriteria 3)");
            }
        }

        // SPV
        if ((usia >= 23 && usia <= 30) && lulusan.equalsIgnoreCase("S1") && pengalamanKerja > 2) {
            System.out.println("Posisi: SPV (Kriteria 1)");
        } else if ((usia >= 25 && usia <= 35) && lulusan.equalsIgnoreCase("D3") && pengalamanKerja > 4) {
            System.out.println("Posisi: SPV 9Kriteria 2");
        }
        input.close();        
    }
}


