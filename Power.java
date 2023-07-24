class Power {
    static String source;
    static String type;
    int quantity;
    String color;

    Power(String source, String type) {
        System.out.println("Invoking static argument constructor in Power");
        this.source = source;
        this.type = type;
    }

    Power(int quantity, String color) {
        System.out.println("Invoking instance argument constructor in Power");
        this.quantity = quantity;
        this.color = color;
    }

    static {
        source = "Electricity";
        type = "Alternative";
        System.out.println("Invoking static block in Power");
    }

    static void printStatic() {
        System.out.println("Invoking static void method in Power");
        System.out.println("Source: " + source);
        System.out.println("Type: " + type);
    }

    void printInstance() {
        System.out.println("Invoking instance void method in Power");
        System.out.println("Quantity: " + quantity);
        System.out.println("Color: " + color);
    }
}
