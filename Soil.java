class Soil {
    static String type;
    static String fertility;
    int quantity;
    String color;

    Soil(String type, String fertility) {
        System.out.println("Invoking static argument constructor in Soil");
        Soil.type = type;
        Soil.fertility = fertility;
    }

    Soil(int quantity, String color) {
        System.out.println("Invoking instance argument constructor in Soil");
        this.quantity = quantity;
        this.color = color;
    }

    static {
        type = "Clay";
        fertility = "Medium";
        System.out.println("Invoking static block in Soil");
    }

    static void printStatic() {
        System.out.println("Invoking static void method in Soil");
        System.out.println("Type: " + type);
        System.out.println("Fertility: " + fertility);
    }

    void printInstance() {
        System.out.println("Invoking instance void method in Soil");
        System.out.println("Quantity: " + quantity);
        System.out.println("Color: " + color);
    }
}







