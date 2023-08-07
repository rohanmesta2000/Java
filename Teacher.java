class Teacher {
    String name;
    String subject;
    int age;
    int experience;
    float salary;
    
    public static void main(String[] args) {
        System.out.println("Invoking main in Teacher");
        
        Teacher teacher1 = new Teacher();
        System.out.println("teacher1 default value is " + teacher1.name);
        System.out.println("teacher1 default value is " + teacher1.subject);
        System.out.println("teacher1 default value is " + teacher1.age);
        System.out.println("teacher1 default value is " + teacher1.experience);
        System.out.println("teacher1 default value is " + teacher1.salary);
        
        System.out.println("\n");
        
        Teacher teacher2 = new Teacher();
        System.out.println("teacher2 default value is " + teacher2.name);
        System.out.println("teacher2 default value is " + teacher2.subject);
        System.out.println("teacher2 default value is " + teacher2.age);
        System.out.println("teacher2 default value is " + teacher2.experience);
        System.out.println("teacher2 default value is " + teacher2.salary);
        
        teacher1.name = "John Smith";
        teacher1.subject = "Mathematics";
        teacher1.age = 35;
        teacher1.experience = 10;
        teacher1.salary = 50000.0f;
        
        teacher2.name = "Jane Doe";
        teacher2.subject = "English";
        teacher2.age = 40;
        teacher2.experience = 15;
        teacher2.salary = 60000.0f;
        
        System.out.println("teacher1 value is " + teacher1.name);
        System.out.println("teacher1 value is " + teacher1.subject);
        System.out.println("teacher1 value is " + teacher1.age);
        System.out.println("teacher1 value is " + teacher1.experience);
        System.out.println("teacher1 value is " + teacher1.salary);
        
        System.out.println("\n");
        
        System.out.println("teacher2 value is " + teacher2.name);
        System.out.println("teacher2 value is " + teacher2.subject);
        System.out.println("teacher2 value is " + teacher2.age);
        System.out.println("teacher2 value is " + teacher2.experience);
        System.out.println("teacher2 value is " + teacher2.salary);
    }
}