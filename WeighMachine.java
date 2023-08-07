class WeighMachine {
    static void measure(String item, double cost, int weight) {
        if (item != null) {
            System.out.println("Item: " + item);
        } else {
            System.out.println("Item is not specified.");
        }

        if (cost >= 0) {
            System.out.println("Cost: " + cost);
        } else {
            System.out.println("Invalid cost value.");
        }

        if (weight >= 0) {
            System.out.println("Weight: " + weight);
        } else {
            System.out.println("Invalid weight value.");
        }
    }
}