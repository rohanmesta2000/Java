class OilKiller {
    public static void main(String[] args) {
        System.out.println("Invoking main in OilKiller");

        Oil oil1 = new Oil();
        System.out.println("Brand: " + oil1.brand);
        System.out.println("Price: " + oil1.price);
        System.out.println("Quantity: " + oil1.quantity);
        System.out.println();

        Oil oil2 = new Oil("sunflower");
        System.out.println("Brand: " + oil2.brand);
        System.out.println("Price: " + oil2.price);
        System.out.println("Quantity: " + oil2.quantity);
        System.out.println();

        Oil oil3 = new Oil("ruchi", 10.99, 5);
        System.out.println("Brand: " + oil3.brand);
        System.out.println("Price: " + oil3.price);
        System.out.println("Quantity: " + oil3.quantity);
    }
}






