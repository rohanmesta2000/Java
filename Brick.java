class Brick {
    static String material;
    static String color;
    int quantity;
    String size;

    Brick(String material, String color) {
        System.out.println("Invoking static argument constructor in Brick");
        Brick.material = material;
        Brick.color = color;
    }

    Brick(int quantity, String size) {
        System.out.println("Invoking instance argument constructor in Brick");
        this.quantity = quantity;
        this.size = size;
    }

    static {
        material = "Clay";
        color = "Red";
        System.out.println("Invoking static block in Brick");
    }

    static void printStatic() {
        System.out.println("Invoking static void method in Brick");
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
    }

    void printInstance() {
        System.out.println("Invoking instance void method in Brick");
        System.out.println("Quantity: " + quantity);
        System.out.println("Size: " + size);
    }
}
