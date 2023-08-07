class Stadium {
    String name;
    String location;
    int capacity;
    boolean isIndoor;

    public static void main(String[] args) {
        System.out.println("Invoking main in Stadium");

        Stadium stadiumA = new Stadium();
        System.out.println("stadiumA default value is " + stadiumA.name);
        System.out.println("stadiumA default value is " + stadiumA.location);
        System.out.println("stadiumA default value is " + stadiumA.capacity);
        System.out.println("stadiumA default value is " + stadiumA.isIndoor);

        System.out.println();

        Stadium stadiumB = new Stadium();
        System.out.println("stadiumB default value is " + stadiumB.name);
        System.out.println("stadiumB default value is " + stadiumB.location);
        System.out.println("stadiumB default value is " + stadiumB.capacity);
        System.out.println("stadiumB default value is " + stadiumB.isIndoor);

        stadiumA.name = "Wembley Stadium";
        stadiumA.location = "London, England";
        stadiumA.capacity = 90000;
        stadiumA.isIndoor = false;

        stadiumB.name = "Madison Square Garden";
        stadiumB.location = "New York City, USA";
        stadiumB.capacity = 20000;
        stadiumB.isIndoor = true;

        System.out.println();
        System.out.println("stadiumA value is " + stadiumA.name);
        System.out.println("stadiumA value is " + stadiumA.location);
        System.out.println("stadiumA value is " + stadiumA.capacity);
        System.out.println("stadiumA value is " + stadiumA.isIndoor);

        System.out.println();
        System.out.println("stadiumB value is " + stadiumB.name);
        System.out.println("stadiumB value is " + stadiumB.location);
        System.out.println("stadiumB value is " + stadiumB.capacity);
        System.out.println("stadiumB value is " + stadiumB.isIndoor);
    }
}