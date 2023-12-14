class Park {
    String parkName;
    String location;
    int area;
    boolean hasPlayground;
    boolean hasLake;
    boolean hasFountains;
    boolean hasBenches;
    boolean hasWalkingPaths;
    boolean hasPicnicAreas;

    Park() {
        System.out.println("Creating a new Park.");
    }

    Park(String parkName) {
        this();
        System.out.println("Setting Park Name: " + parkName);
        this.parkName = parkName;
    }

    Park(String parkName, String location) {
        this(parkName);
        System.out.println("Setting Location: " + location);
        this.location = location;
    }

    Park(String parkName, String location, int area) {
        this(parkName, location);
        System.out.println("Setting Area: " + area + " square meters");
        this.area = area;
    }

    Park(String parkName, String location, int area, boolean hasPlayground) {
        this(parkName, location, area);
        System.out.println("Setting Playground Availability: " + hasPlayground);
        this.hasPlayground = hasPlayground;
    }

    Park(String parkName, String location, int area, boolean hasPlayground, boolean hasLake) {
        this(parkName, location, area, hasPlayground);
        System.out.println("Setting Lake Availability: " + hasLake);
        this.hasLake = hasLake;
    }

    Park(String parkName, String location, int area, boolean hasPlayground, boolean hasLake,
         boolean hasFountains) {
        this(parkName, location, area, hasPlayground, hasLake);
        System.out.println("Setting Fountain Availability: " + hasFountains);
        this.hasFountains = hasFountains;
    }

    Park(String parkName, String location, int area, boolean hasPlayground, boolean hasLake,
         boolean hasFountains, boolean hasBenches) {
        this(parkName, location, area, hasPlayground, hasLake, hasFountains);
        System.out.println("Setting Bench Availability: " + hasBenches);
        this.hasBenches = hasBenches;
    }

    Park(String parkName, String location, int area, boolean hasPlayground, boolean hasLake,
         boolean hasFountains, boolean hasBenches, boolean hasWalkingPaths) {
        this(parkName, location, area, hasPlayground, hasLake, hasFountains, hasBenches);
        System.out.println("Setting Walking Path Availability: " + hasWalkingPaths);
        this.hasWalkingPaths = hasWalkingPaths;
    }

    Park(String parkName, String location, int area, boolean hasPlayground, boolean hasLake,
         boolean hasFountains, boolean hasBenches, boolean hasWalkingPaths, boolean hasPicnicAreas) {
        this(parkName, location, area, hasPlayground, hasLake, hasFountains, hasBenches, hasWalkingPaths);
        System.out.println("Setting Picnic Area Availability: " + hasPicnicAreas);
        this.hasPicnicAreas = hasPicnicAreas;
    }
}
