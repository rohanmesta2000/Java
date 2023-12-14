class Badminton {
    String brand;
    String color;
    int weight;
    int numOfRackets;
    float price;

    public static void main(String[] args) {
        System.out.println("Invoking main in Badminton");

        Badminton badmintonSet1 = new Badminton();
        badmintonSet1.brand = "Yonex";
        badmintonSet1.color = "Blue";
        badmintonSet1.weight = 80;
        badmintonSet1.numOfRackets = 2;
        badmintonSet1.price = 1000;

        Badminton badmintonSet2 = new Badminton();
        badmintonSet2.brand = "Li-Ning";
        badmintonSet2.color = "Red";
        badmintonSet2.weight = 85;
        badmintonSet2.numOfRackets = 2;
        badmintonSet2.price = 1200;

        System.out.println("badmintonSet1 value is " + badmintonSet1.brand);
        System.out.println("badmintonSet1 value is " + badmintonSet1.color);
        System.out.println("badmintonSet1 value is " + badmintonSet1.weight);
        System.out.println("badmintonSet1 value is " + badmintonSet1.numOfRackets);
        System.out.println("badmintonSet1 value is " + badmintonSet1.price);

        System.out.println("\n");

        System.out.println("badmintonSet2 value is " + badmintonSet2.brand);
        System.out.println("badmintonSet2 value is " + badmintonSet2.color);
        System.out.println("badmintonSet2 value is " + badmintonSet2.weight);
        System.out.println("badmintonSet2 value is " + badmintonSet2.numOfRackets);
        System.out.println("badmintonSet2 value is " + badmintonSet2.price);
    }
}