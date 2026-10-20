package module05;

import module05.shapes.Shape;

public class Paint {
    private double coverage;

    public Paint(double c)
    {
        coverage = c;
    }

    public double amount(Shape s)
    {
        System.out.println("Computing amount for " + s);
        // TODO: Ganti return 0 dengan rumus perhitungan jumlah cat (s.area() dibagi coverage)
        return 0;
    }
}
