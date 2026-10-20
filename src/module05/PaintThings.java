package module05;

import module05.shapes.Cylinder;
import module05.shapes.Rectangle;
import module05.shapes.Sphere;

import java.text.DecimalFormat;

public class PaintThings {
    public static void main(String[] args) {
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);
        Rectangle deck;
        Sphere bigBall;
        Cylinder tank;
        double deckAmt, ballAmt, tankAmt;

        // TODO: Instansiasi ketiga bangun ruang (deck, bigBall, dan tank) sesuai ukuran di Lembar Kerja Praktikum

        // TODO: Hitung jumlah cat yang diperlukan untuk masing-masing bangun ruang
        //  Hint: Panggil method yang sudah dibuat dari object paint, sesuaikan bangun ruangnya

        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\nNumber of gallons of paint needed...");
        System.out.println("Deck " + fmt.format(deckAmt));
        System.out.println("Big Ball " + fmt.format(ballAmt));
        System.out.println("Tank " + fmt.format(tankAmt));
    }
}
