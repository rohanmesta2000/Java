class Logo {
    int number;
    boolean flag;
    int age;
    double height;
    boolean isStudent;
    char grade;
    String name;
    char gender;
    boolean isMarried;

    Logo() {
        System.out.println("Invoking no-args constructor");
        System.out.println("Inside constructor: " + this.number);
        System.out.println("Inside constructor: " + this.flag);
        System.out.println("Inside constructor: " + this.age);
        System.out.println("Inside constructor: " + this.height);
        System.out.println("Inside constructor: " + this.isStudent);
        System.out.println("Inside constructor: " + this.grade);
        System.out.println("Inside constructor: " + this.name);
        System.out.println("Inside constructor: " + this.gender);
        System.out.println("Inside constructor: " + this.isMarried);
    }

    Logo(int number) {
        System.out.println("Invoking int parameterized constructor");
        this.number = number;
    }

    Logo(int number, boolean flag) {
        System.out.println("Invoking int, boolean parameterized constructor");
        this.number = number;
        this.flag = flag;
    }

    Logo(int number, boolean flag, int age) {
        System.out.println("Invoking int, boolean, int parameterized constructor");
        this.number = number;
        this.flag = flag;
        this.age = age;
    }

    Logo(int number, boolean flag, int age, double height) {
        System.out.println("Invoking int, boolean, int, double parameterized constructor");
        this.number = number;
        this.flag = flag;
        this.age = age;
        this.height = height;
    }

    Logo(int number, boolean flag, int age, double height, boolean isStudent) {
        System.out.println("Invoking int, boolean, int, double, boolean parameterized constructor");
        this.number = number;
        this.flag = flag;
        this.age = age;
        this.height = height;
        this.isStudent = isStudent;
    }

    Logo(int number, boolean flag, int age, double height, boolean isStudent, char grade) {
        System.out.println("Invoking int, boolean, int, double, boolean, char parameterized constructor");
        this.number = number;
        this.flag = flag;
        this.age = age;
        this.height = height;
        this.isStudent = isStudent;
        this.grade = grade;
    }

    Logo(int number, boolean flag, int age, double height, boolean isStudent, char grade, String name) {
        System.out.println("Invoking int, boolean, int, double, boolean, char, String parameterized constructor");
        this.number = number;
        this.flag = flag;
        this.age = age;
        this.height = height;
        this.isStudent = isStudent;
        this.grade = grade;
        this.name = name;
    }

    Logo(int number, boolean flag, int age, double height, boolean isStudent, char grade, String name, char gender) {
        System.out.println("Invoking int, boolean, int, double, boolean, char, String, char parameterized constructor");
        this.number = number;
        this.flag = flag;
        this.age = age;
        this.height = height;
        this.isStudent = isStudent;
        this.grade = grade;
        this.name = name;
        this.gender = gender;
    }

    Logo(int number, boolean flag, int age, double height, boolean isStudent, char grade, String name, char gender, boolean isMarried) {
        System.out.println("Invoking int, boolean, int, double, boolean, char, String, char, boolean parameterized constructor");
        this.number = number;
        this.flag = flag;
        this.age = age;
        this.height = height;
        this.isStudent = isStudent;
        this.grade = grade;
        this.name = name;
        this.gender = gender;
        this.isMarried = isMarried;
    }
}

