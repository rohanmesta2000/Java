class Boat {
    String name;
    String manufacturer;
    int passengerCapacity;

    Boat() {
        System.out.println("Invoking no args constructor");
        System.out.println("Inside constructor: " + this.name);
        System.out.println("Inside constructor: " + this.manufacturer);
        System.out.println("Inside constructor: " + this.passengerCapacity);
    }

    Boat(String name, String manufacturer, int passengerCapacity) {
        System.out.println("Invoking constructor by passing parameters");
        this.name = name;
        this.manufacturer = manufacturer;
        this.passengerCapacity = passengerCapacity;
    }
}






