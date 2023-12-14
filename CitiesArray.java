class CitiesArray {
    public static void main(String[] args) {
        System.out.println("Running main in cityArray");
        String banglore = "Banglore";
        String honnavar = "Honnavar";
        String kumta = "Kumta";
        String udupi = "Udupi";
        String karwar = "Karwar";
        String sagar = "Sagar";
        String shivamoga = "Shivamoga";
        String tumkhur = "Tumkhur";
        
        
        String[] cities= {banglore,honnavar,kumta,udupi,karwar,sagar,shivamoga,tumkhur};
        
        String ref = cities[0];
        System.out.println("Element at index 0: " + ref);
		String ref1 = cities[3];
        System.out.println("Element at index 3: " + ref1);
		String ref2 = cities[5];
        System.out.println("Element at index 5: " + ref2);
    }
}