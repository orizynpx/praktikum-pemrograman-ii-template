package module03.problem03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // TODO: Inisialiasi ArrayList dengan new
        ArrayList<Student> students;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa Berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");

            int option = Integer.parseInt(input.nextLine());

            switch (option) {
                case 1:
                    // TODO: Tambah Mahasiswa
                    //  1. Minta input nama dan NIM mahasiswa
                    //  2. Periksa apakah NIM sudah terdaftar di ArrayList dengan boolean, loop seperti soal 2, dan if
                    //     Contoh: boolean doesIdAlreadyExist = false
                    //     - Jika NIM yang dimasukkan sama dengan NIM yang sudah ada di ArrayList, set boolean tersebut jadi true
                    //     - Jika boolean true, maka print pesan peringatan
                    //     - Jika NIM unik (doesIdAlreadyExist masih false), instansiasi Student dan tambahkan ke ArrayList (.add())
                    //  3. Print "Mahasiswa {x} ditambahkan."

                    break;

                case 2:
                    // TODO: Hapus Mahasiswa berdasarkan NIM
                    //  1. Minta input NIM yang ingin dihapus
                    //  2. Cari mahasiswa dengan NIM tersebut di dalam ArrayList dengan cara yang mirip seperti case 1
                    //     Contoh: boolean isIdFound = false
                    //     - Jika ada NIM yang sama dengan NIM yang ingin dihapus,
                    //       set boolean jadi true,
                    //       hapus Student dari ArrayList dengan .remove(),
                    //       dan print "Mahasiswa dengan NIM {x} dihapus."
                    //     - Jika tidak ditemukan, tampilkan pesan bahwa NIM tidak ditemukan

                    break;

                case 3:
                    // TODO: Cari Mahasiswa berdasarkan NIM
                    //  Sama saja dengan case 2, tapi pada langkah dihapus, ganti jadi print "NIM: {x}, Nama: {y}"

                    break;

                case 4:
                    // TODO: Tampilkan Seluruh Daftar Mahasiswa
                    //  1. Print "Daftar Mahasiswa:"
                    //  2. Gunakan for loop seperti sebelum-sebelumnya untuk iterasi ArrayList
                    //  3. Print "NIM: {nim}, Nama: {nama}"

                    break;

                case 0:
                    // TODO: Keluar
                    //  1. Kosongkan ArrayList dengan .clear()
                    //  2. Print "Terima kasih!"

                    return; // Apa bedanya break dengan return?

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }
}
