class Metro {
    String color;
    String brand;
    int numOfSeats;
    int numOfDoors;
    float fare;

    public static void main(String[] values) {
        System.out.println("Invoking main in Metro");

        Metro metroOne = new Metro();
        System.out.println("metroOne default value is " + metroOne.color);
        System.out.println("metroOne default value is " + metroOne.brand);
        System.out.println("metroOne default value is " + metroOne.numOfSeats);
        System.out.println("metroOne default value is " + metroOne.numOfDoors);
        System.out.println("metroOne default value is " + metroOne.fare);

        System.out.println("\n");

        Metro metroTwo = new Metro();
        System.out.println("metroTwo default value is " + metroTwo.color);
        System.out.println("metroTwo default value is " + metroTwo.brand);
        System.out.println("metroTwo default value is " + metroTwo.numOfSeats);
        System.out.println("metroTwo default value is " + metroTwo.numOfDoors);
        System.out.println("metroTwo default value is " + metroTwo.fare);

        metroOne.color = "Blue";
        metroOne.brand = "XYZ Metro";
        metroOne.numOfSeats = 100;
        metroOne.numOfDoors = 6;
        metroOne.fare = 2.5f;

        metroTwo.color = "Red";
        metroTwo.brand = "ABC Metro";
        metroTwo.numOfSeats = 80;
        metroTwo.numOfDoors = 4;
        metroTwo.fare = 3.0f;

        System.out.println("\nmetroOne value is " + metroOne.color);
        System.out.println("metroOne value is " + metroOne.brand);
        System.out.println("metroOne value is " + metroOne.numOfSeats);
        System.out.println("metroOne value is " + metroOne.numOfDoors);
        System.out.println("metroOne value is " + metroOne.fare);

        System.out.println("\nmetroTwo value is " + metroTwo.color);
        System.out.println("metroTwo value is " + metroTwo.brand);
        System.out.println("metroTwo value is " + metroTwo.numOfSeats);
        System.out.println("metroTwo value is " + metroTwo.numOfDoors);
        System.out.println("metroTwo value is " + metroTwo.fare);
    }
}