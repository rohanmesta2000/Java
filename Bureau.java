class Bureau {
    static String name;
    static String location;
    int employees;
    String department;

    Bureau(String name, String location) {
        System.out.println("Invoking static argument constructor in Bureau");
        this.name = name;
        this.location = location;
    }

    Bureau(int employees, String department) {
        System.out.println("Invoking instance argument constructor in Bureau");
        this.employees = employees;
        this.department = department;
    }

    static {
        name = "Example Bureau";
        location = "City Center";
        System.out.println("Invoking static block in Bureau");
    }

    static void printStatic() {
        System.out.println("Invoking static void method in Bureau");
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
    }

    void printInstance() {
        System.out.println("Invoking instance void method in Bureau");
        System.out.println("Employees: " + employees);
        System.out.println("Department: " + department);
    }

}
