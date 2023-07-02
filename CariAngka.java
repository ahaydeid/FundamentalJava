import java.util.Scanner;

public class CariAngka {
    public static void main(String[] args) {
        int[] array = {5, 10, 15, 20, 25}; // Array bilangan bulat

        // Menampilkan isi array
        System.out.print("Isi array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        // Mencari indeks suatu nilai dalam array
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nMasukkan angka yang akan dicari: ");
        int angkaDicari = scanner.nextInt();

        int indeks = -1; // Inisialisasi dengan -1, jika nilai tidak ditemukan
        for (int i = 0; i < array.length; i++) {
            if (array[i] == angkaDicari) {
                indeks = i;
                break;
            }
        }

        if (indeks != -1) {
            System.out.println("Angka ditemukan pada indeks: " + indeks);
        } else {
            System.out.println("Angka tidak ditemukan dalam array.");
        }

        // Merubah nilai dalam array
        System.out.print("Masukkan indeks nilai yang akan digantikan: ");
        int indeksGanti = scanner.nextInt();

        if (indeksGanti >= 0 && indeksGanti < array.length) {
            System.out.print("Masukkan nilai baru: ");
            int nilaiBaru = scanner.nextInt();

            array[indeksGanti] = nilaiBaru;

            System.out.print("Array setelah perubahan: ");
            for (int num : array) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("Indeks tidak valid.");
        }

        scanner.close();
    }
}
