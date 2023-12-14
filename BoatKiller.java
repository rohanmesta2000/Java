class BoatKiller{
    public static void main(String[] args) {
       Boat schedule = new Boat();
        System.out.println("\n");
        System.out.println("Invoking main in BoatKiller");
        System.out.println("Name: " + schedule.name);
        System.out.println("Manufacturer: " + schedule.manufacturer);
        System.out.println("PassengerCapacity: " + schedule.passengerCapacity);

        System.out.println("\n");

        Boat schedule1 = new Boat("Titan","Prajwal", 1000);
        System.out.println("Name: " + schedule1.name);
        System.out.println("Manufacturer: " + schedule1.manufacturer);
        System.out.println("PassengerCapacity: " + schedule1.passengerCapacity);
    }
}

