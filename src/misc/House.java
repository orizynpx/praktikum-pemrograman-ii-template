package misc;

public class House {
    // Attributes
    private String paintColor = "blue";
    private String owner;
    private float width;
    private float length;

    // Constructors
    public House(String color, float width, float length) {
        this.paintColor = color;
        this.width = width;
        this.length = length;
    }

    public House(String color) {
        this.paintColor = color;
    }

    public House() {

    }

    // Custom methods
    public float calculateTax() {
        return this.width * this.length * 10;
    }

    // Getter & setter
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
}

class Main {
    public static void main(String[] args) {
        House arulsHouse = new House("green");
        House majasHouse = new House();
    }
}