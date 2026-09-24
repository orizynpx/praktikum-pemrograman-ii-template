package module01.problem03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // TODO: Simpan input yang diterima pada variabel berikut
        int n;
        int startingNum;

        do {
            // TODO: Buat if statement untuk melewati bilangan genap

            // TODO: Buat statement print untuk menampilkan bilangan

            if (n > 1) {
                System.out.print(", ");
            }
            startingNum += 2;
            n--;
        } while (n > 0);
    }
}
