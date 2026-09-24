package module01.problem01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // TODO: Tambahkan input sesuai urutannya di Lembar Kerja Praktikum

        System.out.print("Masukkan Nama Lengkap: ");
        String name = input.nextLine();

        System.out.print("Masukkan Bulan Lahir: ");
        int birthMonth = input.nextInt();

        System.out.print("Masukkan Berat Badan: ");
        double weight = input.nextDouble();

        String monthName = switch (birthMonth) {
            case 1 -> "Januari";
            case 2 -> "Februari";
            // TODO: Lengkapi nama bulan
            default -> "Bulan invalid";
        };

        // TODO: Tampilkan output sesuai Lembar Kerja Praktikum
    }
}