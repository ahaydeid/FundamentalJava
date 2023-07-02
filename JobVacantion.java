import java.util.Scanner;

public class JobVacantion {
    public static void main(String[] args){
        int umur, pengalaman;
        double penampilan;
        String lulusan, nama, jenisKelamin;
        boolean reqKoor1, reqKoor2, reqAdmin1, reqAdmin2;
        boolean isPassingKoor, isPassingAdmin;
        Scanner input = new Scanner(System.in);

        //Buat output text yang dibutuhkan
        System.out.println("Selamat datang di PT.Secret Semut 79");
        System.out.println("====================================\n");
        System.out.println("Silakan Input data anda");

        System.out.println("Nama : ");
        nama = input.next();

        System.out.println("Umur : ");
        umur = input.nextInt();

        System.out.println("Jenis Kelamin (pria/wanita) : ");
        jenisKelamin = input.next();

        System.out.println("Lulusan (SMK/D3/S1) : ");
        lulusan = input.next();

        System.out.println("Pengalaman : ");
        pengalaman = input.nextInt();

        System.out.println("Penampilan : ");
        penampilan = input.nextDouble();


        //Persyaratan Koordinator 1
        reqKoor1 = jenisKelamin.equalsIgnoreCase("Pria") && umur >= 21 && umur <=30 && (lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3")) && pengalaman >= 2;
        
        //Persyaratan Koordinator 2
        reqKoor2 = jenisKelamin.equalsIgnoreCase("Pria") && umur > 30 && lulusan.equalsIgnoreCase("S1") && pengalaman >= 5;

        //Hasil dari Koordinator
        isPassingKoor = reqKoor1 || reqKoor2;


        //Persyaratan Admin 1
        reqAdmin1 = jenisKelamin.equalsIgnoreCase("Wanita") && umur >= 20 && umur <=  25 && lulusan.equalsIgnoreCase("D3") && (penampilan >= 8.5 || pengalaman >= 1);
        
        //Persyaratan Admin 2
        reqAdmin2 = jenisKelamin.equalsIgnoreCase("Wanita") && umur > 25 && lulusan.equalsIgnoreCase("S1") && (penampilan >= 8.5 || pengalaman >= 3);

        //Hasil dari Admin
        isPassingAdmin = reqAdmin1 || reqAdmin2;

        //Membuat Output Text Hasil
        System.out.println();
        System.out.println(nama + ", Terimakasih sudah mengikuti lowongan kerja di PT. Secret Semut 79.\n");
        System.out.println("Berikut adalah hasil dari Rekrutmen untuk koordinator dan Admin :");
        System.out.println("Hasil kelulusan untuk koordinator : " + isPassingKoor);
        System.out.println("Hasil kelulusan untuk Admin : " + isPassingAdmin);
    }
    
}
