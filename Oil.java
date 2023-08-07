class Oil {
    String brand;
    double price;
    int quantity;

    Oil() {
        System.out.println("Invoking no-args constructor");
    }

    Oil(String brand) {
        this.brand = brand;
        System.out.println("Invoking brand parameterized constructor");
    }

    Oil(String brand, double price, int quantity) {
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
        System.out.println("Invoking brand, price, and quantity parameterized constructor");
    }
}