class Gym {
    String name;
    String location;
    int capacity;
    int numOfMembers;
    float membershipFee;

    public static void main(String[] args) {
        System.out.println("Invoking main in Gym");

        Gym gymA = new Gym();
        System.out.println("gymA default value is " + gymA.name);
        System.out.println("gymA default value is " + gymA.location);
        System.out.println("gymA default value is " + gymA.capacity);
        System.out.println("gymA default value is " + gymA.numOfMembers);
        System.out.println("gymA default value is " + gymA.membershipFee);

        System.out.println("\n");

        Gym gymB = new Gym();
        System.out.println("gymB default value is " + gymB.name);
        System.out.println("gymB default value is " + gymB.location);
        System.out.println("gymB default value is " + gymB.capacity);
        System.out.println("gymB default value is " + gymB.numOfMembers);
        System.out.println("gymB default value is " + gymB.membershipFee);

        gymA.name = "FitZone";
        gymA.location = "City Center";
        gymA.capacity = 100;
        gymA.numOfMembers = 50;
        gymA.membershipFee = 150.0f;

        gymB.name = "PowerGym";
        gymB.location = "Main Street";
        gymB.capacity = 200;
        gymB.numOfMembers = 80;
        gymB.membershipFee = 200.0f;

        System.out.println("gymA value is " + gymA.name);
        System.out.println("gymA value is " + gymA.location);
        System.out.println("gymA value is " + gymA.capacity);
        System.out.println("gymA value is " + gymA.numOfMembers);
        System.out.println("gymA value is " + gymA.membershipFee);

        System.out.println("\n");

        System.out.println("gymB value is " + gymB.name);
        System.out.println("gymB value is " + gymB.location);
        System.out.println("gymB value is " + gymB.capacity);
        System.out.println("gymB value is " + gymB.numOfMembers);
        System.out.println("gymB value is " + gymB.membershipFee);
    }
}