class Mall {
    String name;
    String location;
    int capacity;
    boolean hasParking;
    boolean hasRestaurants;
    boolean hasCinema;
    boolean isOpen;

    Mall() {
        System.out.println("Invoking Mall constructor");
    }

    Mall(String name) {
        this();
        System.out.println("Invoking Mall(String) constructor");
        this.name = name;
        System.out.println("Name: " + name);
    }

    Mall(String name, String location) {
        this(name);
        System.out.println("Invoking Mall(String, String) constructor");
        this.location = location;
        System.out.println("Name and Location: " + name + ", " + location);
    }

    Mall(String name, String location, int capacity) {
        this(name, location);
        System.out.println("Invoking Mall(String, String, int) constructor");
        this.capacity = capacity;
        System.out.println("Name, Location, and Capacity: " + name + ", " + location + ", " + capacity);
    }

    Mall(String name, String location, int capacity, boolean hasParking) {
        this(name, location, capacity);
        System.out.println("Invoking Mall(String, String, int, boolean) constructor");
        this.hasParking = hasParking;
        System.out.println("Name, Location, Capacity, and HasParking: " + name + ", " + location + ", " + capacity + ", " + hasParking);
    }

    Mall(String name, String location, int capacity, boolean hasParking, boolean hasRestaurants) {
        this(name, location, capacity, hasParking);
        System.out.println("Invoking Mall(String, String, int, boolean, boolean) constructor");
        this.hasRestaurants = hasRestaurants;
        System.out.println("Name, Location, Capacity, HasParking, and HasRestaurants: " + name + ", " + location + ", " + capacity + ", " + hasParking + ", " + hasRestaurants);
    }

    Mall(String name, String location, int capacity, boolean hasParking, boolean hasRestaurants, boolean hasCinema) {
        this(name, location, capacity, hasParking, hasRestaurants);
        System.out.println("Invoking Mall(String, String, int, boolean, boolean, boolean) constructor");
        this.hasCinema = hasCinema;
        System.out.println("Name, Location, Capacity, HasParking, HasRestaurants, and HasCinema: " + name + ", " + location + ", " + capacity + ", " + hasParking + ", " + hasRestaurants + ", " + hasCinema);
    }

    Mall(String name, String location, int capacity, boolean hasParking, boolean hasRestaurants, boolean hasCinema, boolean isOpen) {
        this(name, location, capacity, hasParking, hasRestaurants, hasCinema);
        System.out.println("Invoking Mall(String, String, int, boolean, boolean, boolean, boolean) constructor");
        this.isOpen = isOpen;
        System.out.println("Name, Location, Capacity, HasParking, HasRestaurants, HasCinema, and IsOpen: " + name + ", " + location + ", " + capacity + ", " + hasParking + ", " + hasRestaurants + ", " + hasCinema + ", " + isOpen);
    }
}