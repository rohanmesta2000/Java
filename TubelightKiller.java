class TubelightKiller{
    public static void main(String[] args) {
        Tubelight schedule = new Tubelight();
        System.out.println("\n");
        System.out.println("Invoking main in TubelightKiller");
        System.out.println("Brand: " + schedule.brand);
        System.out.println("Voltage: " + schedule.voltage);
        System.out.println("IsOn: " + schedule.isOn);

        System.out.println("\n");

        Tubelight schedule1 = new Tubelight("Policab", 4089, false);
        System.out.println("Brand: " + schedule1.brand);
        System.out.println("Voltage: " + schedule1.voltage);
        System.out.println("IsOn: " + schedule1.isOn);
    }
}

