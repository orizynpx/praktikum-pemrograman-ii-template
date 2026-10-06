package module03.problem01;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // TODO: Buat agar variabel berikut menyimpan nilai dari input pengguna berupa integer
        int numberOfDice;

        // TODO: Inisialisasi LinkedList berikut dengan sintaks new
        LinkedList<Dice> diceRolls;

        int total = 0;
        for (int i = 0; i < numberOfDice; i++) {
            // TODO: Instansiasi object Dice dengan new dan masukkan ke dalam LinkedList
            //  Hint 1: Pakai method .add()
            //  Hint 2: Bisa langsung tulis sintaks new di dalam parameter .add() tanpa harus membuat variabel

            // TODO: Print output yang diminta lembar kerja
            //  Hint: Untuk memanggil getter dari object Dice, cari dulu object-nya dari dalam diceRolls
            //        Method yang digunakan untuk itu adalah .get() dengan nilai indeks (i)

            // TODO: Ganti angka 0 berikut dengan getter number untuk menjumlahkan nilai number dari objek Dice
            total += 0;
        }

        System.out.println("Total nilai dadu keseluruhan " + total);
    }
}
