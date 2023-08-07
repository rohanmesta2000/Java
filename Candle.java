class Candle {
    static String brand;
    static String scent;
    int quantity;
    String color;

    Candle(String brand, String scent) {
        System.out.println("Invoking static argument constructor in Candle");
        this.brand = brand;
        this.scent = scent;
    }

    Candle(int quantity, String color) {
        System.out.println("Invoking instance argument constructor in Candle");
        this.quantity = quantity;
        this.color = color;
    }

    static {
        brand = "LightGlow";
        scent = "Vanilla";
        System.out.println("Invoking static block in Candle");
    }

    static void printStatic() {
        System.out.println("Invoking static void method in Candle");
        System.out.println("Brand: " + brand);
        System.out.println("Scent: " + scent);
    }

    void printInstance() {
        System.out.println("Invoking instance void method in Candle");
        System.out.println("Quantity: " + quantity);
        System.out.println("Color: " + color);
    }
}
