class PoliticiansArray {
    public static void main(String[] args) {
        System.out.println("Running main in PoliticiansArray");
        String politician1 = "Narendra Modi";
        String politician2 = "Amit Shah";
        String politician3 = "Mamata Banerjee";
        String politician4 = "Arvind Kejriwal";
        String politician5 = "Uddhav Thackeray";
        String politician6 = "Yogi Adityanath";
        String politician7 = "Naveen Patnaik";
        String politician8 = "Nitish Kumar";
        
        
        String[] politicians = {politician1, politician2, politician3, politician4, politician5, politician6, politician7, politician8};
        
        String ref = politicians[2];
        System.out.println("Element at index 2: " + ref);
    }
}