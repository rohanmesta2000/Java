class Tubelight {
    String brand;
    int voltage;
    boolean isOn;

    Tubelight() {
        System.out.println("Invoking no args constructor");
        System.out.println("Inside constructor: " + this.brand);
        System.out.println("Inside constructor: " + this.voltage);
        System.out.println("Inside constructor: " + this.isOn);
    }

    Tubelight(String brand, int voltage, boolean isOn) {
        System.out.println("Invoking constructor by passing parameters");
        this.brand = brand;
        this.voltage = voltage;
        this.isOn = isOn;
    }
}
