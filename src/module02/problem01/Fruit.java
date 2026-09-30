package module02.problem01;

public class Fruit {
    // TODO: Deklarasikan attribute private

    // TODO: Buat constructor buah
    public Fruit() {

    }

    // TODO: Buat method untuk mencetak informasi tentang buah
    public void printInfo() {

    }

    // TODO: Buat method untuk menghitung harga sebelum diskon
    public double getPreDiscountPrice() {
        return 0;
    }

    // TODO: Buat method untuk menghitung total diskon
    public double getDiscountTotal() {
        return 0;
    }

    public double getPostDiscountPrice() {
        return getPreDiscountPrice() - getDiscountTotal();
    }
}
