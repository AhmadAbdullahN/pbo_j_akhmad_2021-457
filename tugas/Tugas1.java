import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Memilih jenis login
        System.out.println("Pilih Jenis Login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // Konsumsi newline

        if (pilihan == 1) { // Login Admin
            System.out.print("Masukkan Username: ");
            String username = scanner.nextLine();

            System.out.print("Masukkan Password: ");
            String password = scanner.nextLine();

            // Ganti "457" dengan 3 digit terakhir NIM Anda
            String nimAkhir = "457";
            String usernameValid = "Admin" + nimAkhir;
            String passwordValid = "Password" + nimAkhir;

            if (username.equals(usernameValid) && password.equals(passwordValid)) {
                System.out.println("Login Admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }

        } else if (pilihan == 2) { // Login Mahasiswa
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            // Ganti dengan Nama dan NIM Anda
            String namaValid = "Akhmad Abdullah N";
            String nimValid = "202110370311457";

            if (nama.equals(namaValid) && nim.equals(nimValid)) {
                System.out.println("Login Mahasiswa berhasil!");
                System.out.println("Nama: " + nama);
                System.out.println("NIM: " + nim);
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }

        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}