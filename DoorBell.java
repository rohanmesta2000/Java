class DoorBell{
    String brand;
    int numberOfButtons;
    boolean hasCamera;
    boolean isWireless;
    boolean hasMotionSensor;
    boolean isMuted;
    boolean isRinging;
	DoorBell() {
        System.out.println("Invoking no-args constructor");
        System.out.println("Inside constructor: " + this.brand);
        System.out.println("Inside constructor: " + this.numberOfButtons);
        System.out.println("Inside constructor: " + this.hasCamera);
        System.out.println("Inside constructor: " + this.isWireless);
        System.out.println("Inside constructor: " + this.hasMotionSensor);
		System.out.println("Inside constructor: " + this.isMuted);
        System.out.println("Inside constructor: " + this.isRinging);
    }

    DoorBell(String brand)
    {
    System.out.println("Invoking String parameterized constructor");
       this.brand=brand;
    }
    DoorBell(String brand,int numberOfButtons)
    {
    System.out.println("Invoking String,int parameterized constructor");
       this.brand=brand;
       this.numberOfButtons=numberOfButtons;
    }
    DoorBell(String brand,int numberOfButtons,boolean hasCamera)
    {
    System.out.println("Invoking String,int , boolean parameterized constructor");
       this.brand=brand;
       this.numberOfButtons=numberOfButtons;
	   this.hasCamera=hasCamera;
	 }
	 DoorBell(String brand,int numberOfButtons,boolean hasCamera , boolean isWireless)
    {
    System.out.println("Invoking String,int , boolean , boolean parameterized constructor");
       this.brand=brand;
       this.numberOfButtons=numberOfButtons;
	   this.hasCamera=hasCamera;
	   this.isWireless=isWireless;
	 }
	  DoorBell(String brand,int numberOfButtons,boolean hasCamera , boolean isWireless , boolean hasMotionSensor)
    {
     System.out.println("Invoking String,int , boolean , boolean , boolean parameterized constructor");
       this.brand=brand;
       this.numberOfButtons=numberOfButtons;
	   this.hasCamera=hasCamera;
	   this.isWireless=isWireless;
	   this.hasMotionSensor=hasMotionSensor;
	 }
    DoorBell(String brand,int numberOfButtons,boolean hasCamera , boolean isWireless , boolean hasMotionSensor , boolean isMuted)
    {
    System.out.println("Invoking String,int , boolean , boolean , boolean , boolean parameterized constructor");
       this.brand=brand;
       this.numberOfButtons=numberOfButtons;
	   this.hasCamera=hasCamera;
	   this.isWireless=isWireless;
	   this.hasMotionSensor=hasMotionSensor;
	   this.isMuted=isMuted;
	  
	 }
	 	
     DoorBell(String brand,int numberOfButtons,boolean hasCamera , boolean isWireless , boolean hasMotionSensor , boolean isMuted , boolean isRinging)
    {
    System.out.println("Invoking String,int , boolean , boolean , boolean , boolean , boolean parameterized constructor");
       this.brand=brand;
       this.numberOfButtons=numberOfButtons;
	   this.hasCamera=hasCamera;
	   this.isWireless=isWireless;
	   this.hasMotionSensor=hasMotionSensor;
	   this.isMuted=isMuted;
	   this.isRinging=isRinging;
	 }
}