class Chariot {
    int wheels;
    boolean hasHorse;
    int seatingCapacity;
    double length;
    boolean hasArmor;
    char color;
    String owner;
    char symbol;
    boolean hasWeapons;
    int maxSpeed;
    String manufacturer;

    Chariot() {
        System.out.println("Invoking no-args constructor");
        System.out.println("Inside constructor: " + this.wheels);
        System.out.println("Inside constructor: " + this.hasHorse);
        System.out.println("Inside constructor: " + this.seatingCapacity);
        System.out.println("Inside constructor: " + this.length);
        System.out.println("Inside constructor: " + this.hasArmor);
        System.out.println("Inside constructor: " + this.color);
        System.out.println("Inside constructor: " + this.owner);
        System.out.println("Inside constructor: " + this.symbol);
        System.out.println("Inside constructor: " + this.hasWeapons);
        System.out.println("Inside constructor: " + this.maxSpeed);
        System.out.println("Inside constructor: " + this.manufacturer);
    }

    Chariot(int wheels) {
        System.out.println("Invoking int parameterized constructor");
        this.wheels = wheels;
    }

    Chariot(int wheels, boolean hasHorse) {
        System.out.println("Invoking int, boolean parameterized constructor");
        this.wheels = wheels;
        this.hasHorse = hasHorse;
    }

    Chariot(int wheels, boolean hasHorse, int seatingCapacity) {
        System.out.println("Invoking int, boolean, int parameterized constructor");
        this.wheels = wheels;
        this.hasHorse = hasHorse;
        this.seatingCapacity = seatingCapacity;
    }
	Chariot(int wheels, boolean hasHorse, int seatingCapacity,double length) {
        System.out.println("Invoking int, boolean, int , double parameterized constructor");
        this.wheels = wheels;
        this.hasHorse = hasHorse;
        this.seatingCapacity = seatingCapacity;
		this.length = length;
    }
	Chariot(int wheels, boolean hasHorse, int seatingCapacity,double length, boolean hasArmor) {
        System.out.println("Invoking int, boolean, int , double ,boolean parameterized constructor");
        this.wheels = wheels;
        this.hasHorse = hasHorse;
        this.seatingCapacity = seatingCapacity;
		this.length = length;
		this.hasArmor=hasArmor;
    }
	Chariot(int wheels, boolean hasHorse, int seatingCapacity,double length, boolean hasArmor, char color) {
        System.out.println("Invoking int, boolean, int , double , boolean,char parameterized constructor");
        this.wheels = wheels;
        this.hasHorse = hasHorse;
        this.seatingCapacity = seatingCapacity;
		this.length = length;
		this.hasArmor=hasArmor;
		this.color=color;
    }
	Chariot(int wheels, boolean hasHorse, int seatingCapacity,double length, boolean hasArmor, char color, String owner) {
        System.out.println("Invoking int, boolean, int,double,boolean,char,String parameterized constructor");
        this.wheels = wheels;
        this.hasHorse = hasHorse;
        this.seatingCapacity = seatingCapacity;
		this.length = length;
		this.hasArmor=hasArmor;
		this.color=color;
		this.owner=owner;
    }
	Chariot(int wheels, boolean hasHorse, int seatingCapacity,double length, boolean hasArmor, char color, String owner,char symbol) {
        System.out.println("Invoking int, boolean, int,double,boolean,char,String , char parameterized constructor");
        this.wheels = wheels;
        this.hasHorse = hasHorse;
        this.seatingCapacity = seatingCapacity;
		this.length = length;
		this.hasArmor=hasArmor;
		this.color=color;
		this.owner=owner;
		this.symbol=symbol;
    }
	Chariot(int wheels, boolean hasHorse, int seatingCapacity,double length, boolean hasArmor, char color, String owner,char symbol,boolean hasWeapons) {
        System.out.println("Invoking int, boolean, int,double,boolean,char,String , char, boolean parameterized constructor");
        this.wheels = wheels;
        this.hasHorse = hasHorse;
        this.seatingCapacity = seatingCapacity;
		this.length = length;
		this.hasArmor=hasArmor;
		this.color=color;
		this.owner=owner;
		this.symbol=symbol;
		this .hasWeapons=hasWeapons;
    }
	Chariot(int wheels, boolean hasHorse, int seatingCapacity,double length, boolean hasArmor, char color, String owner,char symbol,boolean hasWeapons,int maxSpeed) {
        System.out.println("Invoking int, boolean, int,double,boolean,char,String , char, boolean,int parameterized constructor");
        this.wheels = wheels;
        this.hasHorse = hasHorse;
        this.seatingCapacity = seatingCapacity;
		this.length = length;
		this .hasArmor=hasArmor;
		this .color=color;
		this .owner=owner;
		this .symbol=symbol;
		this .hasWeapons=hasWeapons;
		this .maxSpeed=maxSpeed;
    }
	Chariot(int wheels, boolean hasHorse, int seatingCapacity,double length, boolean hasArmor, char color, String owner,char symbol,boolean hasWeapons,int maxSpeed,String manufacturer) {
        System.out.println("Invoking int, boolean, int,double,boolean,char,String , char, boolean,int , manufacturer parameterized constructor");
        this.wheels = wheels;
        this.hasHorse = hasHorse;
        this.seatingCapacity = seatingCapacity;
		this.length = length;
		this .hasArmor=hasArmor;
		this .color=color;
		this .owner=owner;
		this .symbol=symbol;
		this .hasWeapons=hasWeapons;
		this .maxSpeed=maxSpeed;
		this .manufacturer=manufacturer;
    }

  
}