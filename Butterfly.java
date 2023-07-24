class Butterfly {
    static String name;
    static String species;
    int quantity;
    String color;

    Butterfly(String name, String species) {
        System.out.println("Invoking static argument constructor in Butterfly");
        this.name = name;
        this.species = species;
    }

    Butterfly(int quantity, String color) {
        System.out.println("Invoking instance argument constructor in Butterfly");
        this.quantity = quantity;
        this.color = color;
    }

    static {
        name = "Monarch";
        species = "Danaus plexippus";
        System.out.println("Invoking static block in Butterfly");
    }

    static void printStatic() {
        System.out.println("Invoking static void method in Butterfly");
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
    }

    void printInstance() {
        System.out.println("Invoking instance void method in Butterfly");
        System.out.println("Quantity: " + quantity);
        System.out.println("Color: " + color);
    }

    
}
