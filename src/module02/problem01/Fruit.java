package module02.problem01;

public class Fruit {
    // TODO: Deklarasikan 4 attribute private (nama, harga, berat, dan jumlah pembelian buah)

    private double pricePerKg;

    // TODO: Lengkapi inisialisasi attribute lainnya dengan parameter constructor yang sesuai
    public Fruit(String fruitName) {
        this.fruitName = fruitName;

        this.pricePerKg = this.price * this.weight;
    }

    public void printInfo() {
        // TODO: Tulis System.out.println() sesuai lembar kerja praktikum untuk
        //  mencetak informasi tentang buah dengan bantuan dari method yang ada di bawah
        //  untuk harga sebelum diskon, total diskon, dan harga setelah diskon
    }

    // TODO: Ganti 0 menjadi harga per kg (pricePerKg) dikalikan jumlah pembelian buah
    public double getPreDiscountPrice() {
        return 0;
    }

    public double getDiscountTotal() {
        int discountThresholdKg = 4;
        double discountPercentage = 0.02;

        int discountBatches = (int)(this.purchaseTotal / discountThresholdKg);
        return discountBatches * (this.pricePerKg * discountThresholdKg) * discountPercentage;
    }

    public double getPostDiscountPrice() {
        return getPreDiscountPrice() - getDiscountTotal();
    }
}
