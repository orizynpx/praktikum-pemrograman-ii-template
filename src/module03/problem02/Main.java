package module03.problem02;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // TODO: Terima input untuk jumlah negara
        //  Hint: Gunakan .parseInt(input.nextLine()) dari class Integer
        //        Karena kalau .nextInt() biasa, waktu klik Enter, kan itu sebenarnya "\n" (String, bukan int),
        //        jadi \n itu masuk ke input berikutnya (nama negara)
        int numberOfCountries;

        // TODO: Inisiasi LinkedList berikut dengan new
        LinkedList<Country> countries;
        for (int i = 0; i < numberOfCountries; i++) {
            // TODO: Gunakan .nextLine() untuk menerima input untuk nama negara, jenis kepemimpinan, dan nama pemimpin

            if (leadershipType.equals("monarki")) {
                // TODO: Gunakan .add() untuk memasukkan instansiasi Country dengan constructor yang parameternya cuma 3
                //       ke dalam LinkedList countries
                continue; // Tahu aja kan gunanya continue?
            }

            // TODO: Gunakan cara yang sama seperti numberOfCountries untuk menerima
            //       input tanggal kemerdekaan, bulan kemerdekaan, dan tahun kemerdekaan

            // TODO: Masukkan instansiasi Country dengan constructor yang parameternya lengkap ke dalam countries
        }

        // Q: Loh Bang kok beda sintaks for loop-nya?
        // A: Ini versi Java dari "for country in countries" (Python)
        for (Country country : countries) {
            System.out.println();
            // TODO: Panggil method .printInfo() dari object country
        }
    }
}
