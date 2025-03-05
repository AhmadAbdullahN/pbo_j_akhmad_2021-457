import java.util.Scanner;
import java.time.LocalDate;

public class codelab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Jenis Kelamin (L/P): ");
        char jenisKelamin = scanner.next().charAt(0);

        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = scanner.nextInt();

        // Menghitung umur
        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        // Menentukan jenis kelamin
        String jenisKelaminStr;
        if (jenisKelamin == 'L' || jenisKelamin == 'l') {
            jenisKelaminStr = "Laki-laki";
        } else if (jenisKelamin == 'P' || jenisKelamin == 'p') {
            jenisKelaminStr = "Perempuan";
        } else {
            jenisKelaminStr = "Tidak diketahui";
        }

        // Menampilkan hasil
        System.out.println("\nData Diri:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminStr);
        System.out.println("Umur: " + umur + " tahun");

        // Menutup Scanner
        scanner.close();
    }
}