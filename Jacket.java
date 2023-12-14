class Jacket {
    String color;
    String brand;
    int size;
    int numOfItems;
    float price;

    public static void main(String[] args) {
        System.out.println("Invoking main in Jacket");
        
        Jacket jacket1 = new Jacket();
        System.out.println("jacket1 default value is " + jacket1.color);
        System.out.println("jacket1 default value is " + jacket1.brand);
        System.out.println("jacket1 default value is " + jacket1.size);
        System.out.println("jacket1 default value is " + jacket1.numOfItems);
        System.out.println("jacket1 default value is " + jacket1.price);

        System.out.println("\n");

        Jacket jacket2 = new Jacket();
        System.out.println("jacket2 default value is " + jacket2.color);
        System.out.println("jacket2 default value is " + jacket2.brand);
        System.out.println("jacket2 default value is " + jacket2.size);
        System.out.println("jacket2 default value is " + jacket2.numOfItems);
        System.out.println("jacket2 default value is " + jacket2.price);

        jacket1.color = "Blue";
        jacket1.brand = "Levi's";
        jacket1.size = 40;
        jacket1.numOfItems = 5;
        jacket1.price = 150.0f;

        jacket2.color = "Black";
        jacket2.brand = "Zara";
        jacket2.size = 36;
        jacket2.numOfItems = 3;
        jacket2.price = 200.0f;

        System.out.println("\n");

        System.out.println("jacket1 value is " + jacket1.color);
        System.out.println("jacket1 value is " + jacket1.brand);
        System.out.println("jacket1 value is " + jacket1.size);
        System.out.println("jacket1 value is " + jacket1.numOfItems);
        System.out.println("jacket1 value is " + jacket1.price);

        System.out.println("\n");

        System.out.println("jacket2 value is " + jacket2.color);
        System.out.println("jacket2 value is " + jacket2.brand);
        System.out.println("jacket2 value is " + jacket2.size);
        System.out.println("jacket2 value is " + jacket2.numOfItems);
        System.out.println("jacket2 value is " + jacket2.price);
    }
}